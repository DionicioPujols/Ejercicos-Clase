import java.util.*;

public class Registro {
    private ArrayList<Paciente> listaPacientes;

    public Registro() {
        listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
    }

    public void mostrarRegistro() {
        if (listaPacientes.isEmpty()) {
            System.out.println("El registro de pacientes está vacío.");
        } else {
            System.out.println("\n|| --- Registro de pacientes --- ||");
            
             System.out.println("\n --- LISTA DEL REGISTRO --- ");
            for (Paciente p : listaPacientes) {
                System.out.println("Nombre: " + p.getNombre());
                System.out.println("Fecha de nacimiento: " + p.getFechaNacimiento());
                System.out.println("Edad" + p.getEdad());
                System.out.println("Teléfono: " + p.getTelefono());
                System.out.println("Dirección: " + p.getDireccion());
                System.out.println("Sexo: " + p.getSexo());
                System.out.println("Cédula: " + p.getCedula());
                System.out.println("Seguro: " + (p.isSeguro() ? "Sí" : "No"));
                System.out.println("Estatura: " + p.getEstatura() + " m");
                System.out.println("Peso: " + p.getPeso() + "Kg");
                System.out.printf("IMC: %.2f\n", p.calcularIMC());
                System.out.println("Diagnóstico: " + p.determinarCategoriaPeso());
                System.out.println("---------------------------------");
            }
        }
    }

    //Metodo para buscar paciente por una cedula registrada

    public Paciente buscarPacientePorCedula(String cedulaBuscar) {
        for (Paciente p : listaPacientes) {
            if (p.getCedula().equals(cedulaBuscar)) {
                return p; /
            }
        }
        return null; 
}