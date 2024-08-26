import java.util.ArrayList;
import java.util.List;

public class DATA {
    public static ArrayList<Alumno> listaDeAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", "Martínez", 20));
        alumnos.add(new Alumno("Carlos", "López", 22));
        alumnos.add(new Alumno("María", "González", 19));
        alumnos.add(new Alumno("Pedro", "Fernández", 21));
        alumnos.add(new Alumno("Luisa", "Ramírez", 18));

        return alumnos;
    }
}

