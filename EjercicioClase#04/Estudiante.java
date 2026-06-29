public class Estudiante{
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(){
        setNombre("");
        setEdad(0);
        setCarrera("");
    }
    public Estudiante(String nombre, int edad, String carrera){
        setNombre(nombre);
        setEdad(edad);
        setCarrera(carrera);
    }

    //getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getCarrera(){
        return carrera;
    }
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

}