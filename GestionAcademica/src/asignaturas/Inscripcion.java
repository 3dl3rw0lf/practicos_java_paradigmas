package asignaturas;

import miembros.Estudiante;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Inscripcion {
    private Estudiante estudiante;
    private Curso paraEl;
    private static LocalDateTime fechaInscripcion;

    public Inscripcion(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.paraEl = curso;
        fechaInscripcion = LocalDateTime.now();
    }

    //TODO: ???
    private void alumno(){
        estudiante.inscribir(paraEl);
    }

    public Curso getParaEl() {
        return paraEl;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public static String getFechaInscripcion() {
        return fechaInscripcion.format(DateTimeFormatter.ofPattern("E dd/MM/YYYY HH:mm"));
    }

    public static boolean estaInscripto(String apellidoEstudiante, String nombreEstudiante, Curso curso){
        for(Inscripcion inscripcion : curso.getDelAlumno()){
            if(inscripcion.getEstudiante().getApellido().equals(apellidoEstudiante) &&
                    inscripcion.getEstudiante().getNombre().equals(nombreEstudiante)){
                return true;
            }
        }
        return false;
    }

    // rominapalmieri@gmail.com
}
