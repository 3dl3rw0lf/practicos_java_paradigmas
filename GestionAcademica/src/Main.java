import asignaturas.Curso;
import asignaturas.Inscripcion;
import miembros.Estudiante;
import miembros.Profesor;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate fechaNacimientoProfesor = LocalDate.of(1965,5,5);
        Profesor wilkinson = new Profesor("Pablo", "Wilkinson", 15982635,fechaNacimientoProfesor,
                "Masculino", 23682);

        Curso paradigmas = new Curso("Paradigmas");
        Curso sistemasOperativos = new Curso("Sistemas Operativos");
        wilkinson.dicta(paradigmas);

        wilkinson.cursoProfesor();

        Estudiante arauz = new Estudiante("Gustavo", "Arauz", 27298517, "Masculino", LocalDate.of(1980,1,9), 48571);
        Estudiante wagner = new Estudiante("Eugenia", "Wagner", 26911237, "Femenino", LocalDate.of(1979,9,22), 49571);

        arauz.inscribir(paradigmas);
        wagner.inscribir(paradigmas);

        paradigmas.mostrarInscriptos();

        // Hashtable
        paradigmas.mostrarInscripcionesHT();

        System.out.println(paradigmas.cantidadInscriptos());

        boolean estaInscrito = false;
        String nombre = "";
        String apellido = "";

        // Buscar un estudiante sin inscripción
        nombre = "Kal";
        apellido = "El";
        estaInscrito = Inscripcion.estaInscripto(apellido, nombre, paradigmas);
        System.out.println("¿El estudiante " + nombre + " " + apellido + " está inscripto en "+ Curso.getTitulo() +
                           "? " + estaInscrito);


        // Buscar un estudiante inscripto
        nombre = "Gustavo";
        apellido = "Arauz";
        estaInscrito = Inscripcion.estaInscripto(apellido, nombre, paradigmas);
        System.out.println("¿El estudiante " + nombre + " " + apellido + " está inscripto en "+ Curso.getTitulo() +
                           "? " + estaInscrito);

        arauz.inscriptoCurso();
        System.out.println(arauz.getCorreo());
    }
}