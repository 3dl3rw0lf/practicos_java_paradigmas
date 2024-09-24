package asignaturas;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Curso {
    //private static String titulo;
    private String titulo;
    private ArrayList<Inscripcion> delAlumno = new ArrayList<>(42);
    private Hashtable<Integer, Inscripcion> delAlumnoHT = new Hashtable<>();

    public Curso(String nombre){
        this.titulo = nombre;
    }

    public void agregarInscripcion(Inscripcion inscripcion){
        this.delAlumno.add(inscripcion);
    }

    public void agregarInscripcionHT(Integer legajo,Inscripcion inscripcion){
        this.delAlumnoHT.put(legajo, inscripcion);
    }

    //public static String getTitulo(){
    public String getTitulo(){
        return titulo;
    }

    public void mostrarInscriptos(){
        if (delAlumno.isEmpty()){
            System.out.println("Sin inscripciones en el curso "+ getTitulo());
        } else {
            System.out.println("Inscriptos en el curso "+ getTitulo());
            for (Inscripcion alumno : delAlumno){
                System.out.println(alumno.getEstudiante().getNombre() + " " + alumno.getEstudiante().getApellido());
                System.out.println(alumno.getEstudiante().getLegajoAlumno());
                System.out.println("Inscripto el "+ Inscripcion.getFechaInscripcion());
            }
        }
    }

    public void mostrarInscripcionesHT(){
        if (delAlumnoHT.isEmpty()){
            System.out.println("(HT)Sin inscripciones en el curso "+ getTitulo());
        } else {
            System.out.println("(HT)Inscriptos en el curso "+ getTitulo());
            Enumeration<Inscripcion> enumeracion = delAlumnoHT.elements();
            while (enumeracion.hasMoreElements()){
                Inscripcion key = enumeracion.nextElement();
                System.out.println(key.getEstudiante().getNombre() + " " +
                                    key.getEstudiante().getApellido()+"\n"+
                                    key.getEstudiante().getLegajoAlumno());

                //System.out.println("Inscripto el "+ Inscripcion.getFechaInscripcion());
            }
        }
    }

    public ArrayList<Inscripcion> getDelAlumno() {
        return this.delAlumno;
    }

    public int cantidadInscriptos(){
        return delAlumno.size();
    }


}
