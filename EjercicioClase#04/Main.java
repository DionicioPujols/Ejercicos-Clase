import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do{
            System.out.println("\n|| --------------------------------------- ||");
            System.out.println("|| -- Sistemas para agregar estudiantes -- ||");
            System.out.println("|| --------------------------------------- ||");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccionar una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
            case 1:
                AgregarEstudiante();
                break;
            case 2:
                MostrarEstudiantes();
                break;
            case 3:
                System.out.println("Saliendo del programa...");
            default:
                System.out.println("Opción no válida.");
            }
        }while(opcion != 3);

        File archive = new File("Estudiante.txt");

        System.out.println("Nombre del archivo: " + archive.getName());
        System.out.println("Ruta del archivo: " + archive.getPath());
        System.out.println("El archivo existe: " + archive.exists());
    }


    public static void AgregarEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Seccion para agregar estudiantes --\n");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        try{
            FileWriter writer = new FileWriter("Estudiante.txt", true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("-- Lista de estudiantes --\n");
            bw.write("Nombre: " + nombre);
            bw.newLine();
            bw.write("Edad: " + edad);
            bw.newLine();
            bw.write("Carrera: " + carrera);
            bw.write("\n--------------------------------");
            bw.newLine();

            bw.close();
            System.out.println("El estudiante fue agregado con exito!");
        }catch(IOException e){
            System.out.println("Error al agregar el estudiante: " + e.getMessage());
        }
    }

    public static void MostrarEstudiantes(){
        try{
            String linea;
            FileReader reader = new FileReader("Estudiante.txt");
            BufferedReader br = new BufferedReader(reader);
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            } 
        br.close();

        }catch(IOException e){
            System.out.println("Error al mostrar los estudiantes: " + e.getMessage());
        }
    }
}