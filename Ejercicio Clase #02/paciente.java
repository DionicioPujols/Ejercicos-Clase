import java.util.*;

public class paciente{
    
    private String nombre;
    private int fechaNacimiento;
    private int edad;
    private String telefono;
    private String direccion;
    private String sexo;
    private String cedula;
    private boolean seguro;

    public paciente(String nombre, int fechaNacimiento, int edad, String  telefono, 
                    String direccion, String sexo, String cedula, boolean seguro ){
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);
        setTelefono(telefono);
        setDireccion(direccion);
        setSexo(sexo);
        setCedula(cedula);
        setSeguro(seguro);
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

}