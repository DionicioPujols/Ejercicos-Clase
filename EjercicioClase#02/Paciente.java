import java.util.*;

public class Paciente{
    
    private String nombre;
    private int fechaNacimiento;
    private int edad;
    private String telefono;
    private String direccion;
    private String sexo;
    private String cedula;
    private boolean seguro;
    private double estatura; 
    private double peso;


    public Paciente(String nombre, int fechaNacimiento, int edad, String  telefono, 
                    String direccion, String sexo, String cedula, boolean seguro, double estatura, double peso){
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);
        setTelefono(telefono);
        setDireccion(direccion);
        setSexo(sexo);
        setCedula(cedula);
        setSeguro(seguro);
        setEstatura(estatura);
        setPeso(peso);
        
    }

    public double calcularIMC() {
        if (estatura <= 0) return 0;
        return peso / (estatura * estatura);
    }

    public String determinarCategoriaPeso() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Peso bajo";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else {
            return "Sobrepeso";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public double getEstatura(){
        return estatura;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

}