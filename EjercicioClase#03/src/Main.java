package src;
import java.util.*;

public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|| === Sistema de Registro de Estudiantes === ||\n");
        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");

        int edad = 0;
        try {
            edad = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            edad = -1; 
        }

        System.out.print("Ingrese el índice académico: ");
        double indice = 0.0;
        try {
            indice = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            indice = -1.0; 
        }

        System.out.println("\n--- Resultado ---");
        
        try {
            ValidarEstudiante.validarEstudiante(nombre, edad, indice);
            
            System.out.println("Estudiante registrado correctamente.");

        } catch (EstInvalidoException e) {
    
            System.out.println(e.getMessage());

        } catch (Exception e) {
  
            System.out.println("Error inesperado: " + e.getMessage());
            
        } finally {
            System.out.println("Proceso finalizado.");
            scanner.close();
        }
    }
}
