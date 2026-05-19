import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro miRegistro = new Registro();
        
        int opcion = 0;


        while (opcion != 3) {
            System.out.println("\n|| ===== MENU MEDICO ===== ||");
            System.out.println("||1. Registrar Paciente      ||");
            System.out.println("||2. Mostrar Pacientes e IMC ||");
            System.out.println("||3. Salir                   ||\n");
            System.out.print("Elija una opcion: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("\n--- INGRESAR DATOS DEL PACIENTE ---");
                    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    
                    System.out.print("Año de nacimiento: ");
                    int fechaNac = sc.nextInt();
                    
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); 
                    
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    
                    System.out.print("Sexo: ");
                    String sexo = sc.nextLine();
                    
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    
                    System.out.print("¿Tiene seguro? TRUE/FALSE: ");
                    boolean seguro = sc.nextBoolean();
                    
                    System.out.print("Estatura en metros: ");
                    double estatura = sc.nextDouble();
                    
                    System.out.print("Peso en Kg: ");
                    double peso = sc.nextDouble();
                    sc.nextLine(); 

                    Paciente nuevoPaciente = new Paciente(nombre, fechaNac, edad, telefono, direccion, sexo, cedula, seguro, estatura, peso);
                    
                    miRegistro.agregarPaciente(nuevoPaciente);
                    System.out.println("Paciente registrado con exito");
                    break;

                case 2:
                    miRegistro.mostrarRegistro();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta, intente de nuevo.");
                    break;
            }
        }
        
        sc.close();
    }
}