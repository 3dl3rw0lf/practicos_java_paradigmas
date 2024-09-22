package miembros;

import asignaturas.Curso;
import vistas.MostrarPersona;

import java.time.LocalDate;

public class Profesor extends Persona{
    private Integer legajoProfesor;
    private Curso docente;

    public Profesor(String nombre, String apellido, int du, LocalDate fechaNacimiento, String sexo,
                    Integer legajoProfesor){
       super(nombre, apellido, du, fechaNacimiento, sexo);
       this.legajoProfesor = legajoProfesor;
    }

    public void dicta(Curso curso){
        this.docente = curso;
    }

    public void cursoProfesor(){
        //TODO: hacer método aparte
        MostrarPersona<Profesor> vistaProfesor = new MostrarPersona<>(this);
        vistaProfesor.mostrarPersona(this);
    }


}
