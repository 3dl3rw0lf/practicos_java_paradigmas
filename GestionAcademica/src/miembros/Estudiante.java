package miembros;

import asignaturas.Curso;
import asignaturas.Inscripcion;
import vistas.MostrarPersona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante extends Persona{
    private Integer legajoAlumno;
    private ArrayList<Inscripcion> inscripto = new ArrayList<>();
    public Curso inscriptoCurso;

    public Estudiante(String nombre, String apellido, int du, String sexo, LocalDate fechaNacimiento,
                      Integer legajo){
        super(nombre, apellido, du, fechaNacimiento, sexo);
        this.legajoAlumno = legajo;
    }

    public void inscribir(Curso curso){
        //TODO: agregar error inscripción
        Inscripcion inscripcion = new Inscripcion(this, curso);
        inscripto.add(inscripcion);
        curso.agregarInscripcion(inscripcion);

        curso.agregarInscripcionHT(this.getLegajoAlumno(), inscripcion);

        MostrarPersona<Estudiante> vistaEstudiante = new MostrarPersona<>(this);
        vistaEstudiante.mostrarPersona(this);
    }

    public void inscriptoCurso(){
        if (!inscripto.isEmpty()) {
            for (Inscripcion inscripcion : inscripto) {
                System.out.println("Inscripto en el curso: " + inscripcion.getParaEl().getTitulo());
            }
        } else {
            System.out.println("No está inscripto en ningún curso.");
        }
    }


    public Integer getLegajoAlumno() {
        return legajoAlumno;
    }
}
