import java.util.*;

public class SistemaCentroSalud{

    public static void main(String [] args){

        //Imprementacion de la Cola (Queue) para almacenar los pacientes
        Queue<Paciente> colaEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0 ;

        // Menu de opciones para el usuario
        System.out.println("=====SISTEMA DE REGISTRO DEL CENTRO DE SALUD=====");
        
        do {
            System.out.println("\n---Menú de opciones---");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Ver número de pacientes en espera");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            //Validación de la entrada del usuario para asegurarse de que sea un número entero
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }
            // Validación de la opción ingresada por el usuario
            switch (opcion) {
                //Registro de un nuevo paciente
                case 1:
                    System.out.print("Ingrese el nombre del paciente:");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del paciente:");
                    int edad;
                    try {
                        edad = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese un número válido para la edad.");
                        break;
                    }
                    System.out.print("Ingrese el motivo de la consulta:");
                    String motivo = scanner.nextLine();

                    Paciente nuevoPaciente = new Paciente(nombre, edad, motivo);
                    registrarPaciente(colaEspera, nuevoPaciente);
                    break;

                //Atender al siguiente paciente

                case 2:
                    atenderPaciente(colaEspera);
                    break;

                //Numero de pacientes en espera
                case 3:
                    System.out.println("Pacientes actualmente en espera: " + colaEspera.size());
                    break;


                // Opcion para salir del programa
                case 4:
                    System.out.println(" ========== Saliendo del programa ========== ");
                    break;

                //En caso de ingresar una entrada invalida
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while(opcion!=4);
        scanner.close();
    }
    public static void atenderPaciente(Queue<Paciente> cola) {
        // Verificamos que la cola no esté vacía
        if (!cola.isEmpty()) {
            // poll() extrae y elimina el primer elemento de la cola (FIFO)
            Paciente pacienteAtendido = cola.poll();
            System.out.println("-> ATENDIENDO A: " + pacienteAtendido.toString());
            System.out.println("-> Pacientes restantes en espera: " + cola.size());
            System.out.println("------------------------------------------------------");
        } else {
            System.out.println("-> AVISO: No hay pacientes en espera en este momento.");
        }
    }

    public static void registrarPaciente(Queue<Paciente> cola, Paciente paciente) {
        cola.add(paciente); // add() ingresa al final de la cola
        System.out.println("[REGISTRO] Ingresa: " + paciente.getNombre() + ". Pacientes en espera: " + cola.size());
    }
}