/*
 * Project: GestionAcademica
 * Package: vistas
 * Class: MostrarPersona
 * Version: 1.0
 * Date: 17/09/2024 19:04
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */
package vistas;

import asignaturas.Curso;
import asignaturas.Inscripcion;
import miembros.Estudiante;
import miembros.Persona;
import miembros.Profesor;

public class MostrarPersona<T extends Persona> {
    private T t;

    public MostrarPersona(T t) {
        this.t = t;
    }

    public void mostrarPersona(T t) {
        int anchoCaja = 42;
        String clase = "";
        String tipo = "";
        String fecha = "";

        if (t.getClass().equals(Estudiante.class)) {
            clase = "ESTUDIANTE";
            tipo = "INSCRIPTO";
            fecha = Inscripcion.getFechaInscripcion();
        }

        if (t.getClass().equals(Profesor.class)) {
            clase = "PROFESOR";
            tipo = "DICTA";
            fecha = " ";
        }

        String curso = Curso.getTitulo();
        String nombreCompleto = t.getNombre() + " " + t.getApellido();

        String borde = "*".repeat(anchoCaja);

        System.out.println(borde);

        System.out.println(centrarTextoEnCaja(clase, anchoCaja));
        System.out.println(centrarTextoEnCaja(nombreCompleto, anchoCaja));

        System.out.println(borde);

        System.out.println(centrarTextoEnCaja(tipo, anchoCaja));
        System.out.println(centrarTextoEnCaja(curso, anchoCaja));
        System.out.println(centrarTextoEnCaja(fecha, anchoCaja));

        System.out.println(borde+"\n");
    }

    private String centrarTextoEnCaja(String texto, int anchoCaja) {
        int espaciosDisponibles = anchoCaja - 2 - texto.length();
        int paddingIzquierda = espaciosDisponibles / 2;
        int paddingDerecha = espaciosDisponibles - paddingIzquierda;

        return String.format("*%" + (paddingIzquierda + texto.length()) + "s%" + paddingDerecha + "s*", texto, "");
    }
}
