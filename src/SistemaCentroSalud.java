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


            
        }
        
    }
}