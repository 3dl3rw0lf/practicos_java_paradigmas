import asignaturas.Curso;
import asignaturas.Inscripcion;
import errores.ErrorInscripcion;
import miembros.Estudiante;
import miembros.Profesor;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ErrorInscripcion {

        Profesor wilkinson = new Profesor("Pablo", "Wilkinson", 21763983,
                LocalDate.of(1970,9,3),"Masculino", 35459);
        Profesor faccio = new Profesor("Sergio", "Faccio", 14801501,
                LocalDate.of(1692,10,14), "Masculino" ,28809);
        Profesor brachetta = new Profesor("Mariana", "Brachetta", 22423652,
                LocalDate.of(1971,11,20),"Femenino", 39568);
        Profesor ortiz = new Profesor("Italo", "Ortiz", 12378529,
                LocalDate.of(1958,6,13), "Masculino", 20548);

        Curso algoritmos = new Curso("Algoritmos");
        Curso sistemasOperativos = new Curso("Sistemas Operativos");
        Curso paradigmas = new Curso("Paradigmas");
        Curso fisica = new Curso("Fisica");

        wilkinson.dicta(algoritmos);
        faccio.dicta(sistemasOperativos);
        brachetta.dicta(paradigmas);
        ortiz.dicta(fisica);



        Estudiante arauz = new Estudiante("Gustavo", "Arauz", 27298517, "Masculino",
                LocalDate.of(1980,1,9), 48571);
        Estudiante wagner = new Estudiante("Eugenia", "Wagner", 26911237, "Femenino",
                LocalDate.of(1979,9,22), 49571);

        wilkinson.cursoProfesor();
        arauz.inscribir(algoritmos);
        wagner.inscribir(algoritmos);

        algoritmos.mostrarInscriptos();

        // Hashtable
        algoritmos.mostrarInscripcionesHT();

        System.out.println(algoritmos.cantidadInscriptos());

        boolean estaInscrito = false;
        String nombre = "";
        String apellido = "";

        // Buscar un estudiante sin inscripción
        nombre = "Kal";
        apellido = "El";
        estaInscrito = Inscripcion.estaInscripto(apellido, nombre, algoritmos);
        System.out.printf("¿El estudiante %s %s está inscripto en %s? %s%n", nombre, apellido, paradigmas.getTitulo()
                /*Curso.getTitulo()*/, estaInscrito);


        // Buscar un estudiante inscripto
        nombre = "Gustavo";
        apellido = "Arauz";
        estaInscrito = Inscripcion.estaInscripto(apellido, nombre, algoritmos);
        System.out.printf("¿El estudiante %s %s está inscripto en %s? %s%n", nombre, apellido, paradigmas.getTitulo()
                /*Curso.getTitulo()*/, estaInscrito);

        try {
            arauz.inscribir(sistemasOperativos);
        } catch (ErrorInscripcion errorInscripcion) {
            System.out.println(errorInscripcion.getMessage());
        }

        try {
            arauz.inscribir(paradigmas);
        } catch (ErrorInscripcion errorInscripcion){
            System.out.println(errorInscripcion.getMessage());
        }

        try {
            arauz.inscribir(fisica);
        } catch (ErrorInscripcion errorInscripcion){
            System.out.println(errorInscripcion.getMessage());
        }


        System.out.println(arauz.getCorreo());
    }
}