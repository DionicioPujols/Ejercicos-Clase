package src;

public class ValidarEstudiante {
    public static void validarEstudiante(String nombre, int edad, double indice) throws EstInvalidoException{
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new EstInvalidoException("Error: El nombre no puede estar vacío.");
        }

        if (edad < 18 || edad > 100) {
            throw new EstInvalidoException("Error: La edad debe ser mayor o igual a 18 años.");
        }

        if (indice < 0.0 || indice > 4.0) {
            throw new EstInvalidoException("Error: El índice debe estar entre 0 y 4.");
        }
    }
}
