package UPT.JAVA.DAO;
import UPT.JAVA.BEAN.Alumno;
import java.util.*;

public class AlumnoDAO {
Alumno objAlumno;
ArrayList<Alumno> LISTA;

public AlumnoDAO(){
LISTA = new ArrayList<Alumno>();
}
    
public ArrayList<Alumno> cargarDatos(){
    for (int i = 0; i < 3; i++) {
        objAlumno = new Alumno();
        objAlumno.setCodigo("001");
        objAlumno.setNombre("Oscar");
        objAlumno.setApellido("Sanchez");
        objAlumno.setEdad("25");
        LISTA.add(objAlumno);
    }
    return LISTA;
}
}
