package miembros;

import asignaturas.Curso;
import asignaturas.Inscripcion;
import errores.ErrorInscripcion;
import vistas.MostrarPersona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Estudiante extends Persona{
    private Integer legajoAlumno;
    private ArrayList<Inscripcion> inscripto = new ArrayList<>();
    private Curso curso;

    public Estudiante(String nombre, String apellido, int du, String sexo, LocalDate fechaNacimiento,
                      Integer legajo){
        super(nombre, apellido, du, fechaNacimiento, sexo);
        this.legajoAlumno = legajo;
    }


    public void inscribir(Curso curso) throws ErrorInscripcion{
        //TODO: agregar error inscripción
        if (inscripto.size() >= 3){
            throw new ErrorInscripcion("El estudiante "+ this.getNombre() + this.getApellido() + " con legajo " +
                    this.getLegajoAlumno() + " está inscripto a más de 3 cursos");
        }
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

    public String getCurso() {
        if (!inscripto.isEmpty()) {
            for (Inscripcion inscripcion : inscripto) {
                return inscripcion.getParaEl().getTitulo();
            }
        } else {
            return "No está inscripto en ningún curso.";
        }
        return null;
    }

    public Integer getLegajoAlumno() {
        return legajoAlumno;
    }
}
