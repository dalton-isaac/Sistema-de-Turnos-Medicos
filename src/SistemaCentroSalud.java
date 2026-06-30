import java.util.*;

public class SistemaCentroSalud{

    public static void main(String [] args){

        //Imprementacion de la Cola (Queue) para almacenar los pacientes
        Queue<Paciente> colaEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0 ;

        // Menu de opciones para el usuario
        System.out.println("=====SISTEMA DE REGISTRO DEL CENTRO DE SALUD=====");
        
        do{
            System.out.println("\n---Menú de opciones---");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Atender siguiente paciente");
            System.out.println("3. Ver número de pacientes en espera");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            //Validación de la entrada del usuario para asegurarse de que sea un número entero
            try{
                opcion = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }
            // Validación de la opción ingresada por el usuario
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese el nombre del paciente:");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del paciente:");
                    int edad;
                    try{
                        edad = Integer.parseInt(scanner.nextLine());
                    }catch (NumberFormatException e){
                        System.out.println("Por favor, ingrese un número válido para la edad.");
                        break;
                    }
                    System.out.print("Ingrese el motivo de la consulta:");
                    String motivo = scanner.nextLine();

                    Paciente nuevoPaciente = new Paciente(nombre, edad, motivo);
                    registrarPaciente(colaEspera, nuevoPaciente);
                    break;
                case 2:
                    atenderPaciente(colaEspera);
                    break;
            }
        }
        
    }
}