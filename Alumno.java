public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;

    Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad=edad ;
    }

    public String getNombre(){
        return this.nombre;
    }
    public  String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.apellido = apellido;
    }

}
