/*
 * PH
 * Versión 0.1.0
 * 2024-09-10
 * Gustavo A. Aráuz
 */

package inmuebles;

import errores.ErrorLote;

import java.util.ArrayList;

public class PH extends Edificio {
    public byte cantidadPisos;
    public byte cantidadDepartamentosPorPiso;
    public ArrayList<Departamento> departamentos = new ArrayList<>();

    private char[] departamentoLetra = new char[4];
    private char[] departamentoLetraPiso;

    public PH(float avaluo, byte plantas) {
        super(avaluo);
        cantidadPisos = plantas;

        if (cantidadPisos > 0) {
            departamentoLetra[0] = (char) 'A';
            departamentoLetra[1] = (char) 'B';
            departamentoLetra[2] = (char) 'C';
            departamentoLetra[3] = (char) 'D';

            for (int i = 0; i < cantidadPisos; i++) {
                for (int j = 0; j < departamentoLetra.length; j++) {
                    departamentos.add(new Departamento((byte) i, departamentoLetra[j], 70));
                }
            }
        }
    }

    public PH(float avaluo, byte plantas, byte departamentosPorPiso) {
        super(avaluo);
        cantidadPisos = plantas;
        cantidadDepartamentosPorPiso = departamentosPorPiso;

        departamentoLetraPiso = new char[cantidadDepartamentosPorPiso];
        if (cantidadPisos > 0) {
            for (int d = 0; d < cantidadDepartamentosPorPiso; d++) {
                departamentoLetraPiso[d] = (char) ('A' + d);
            }

            for (int i = 0; i < cantidadPisos; i++) {
                for (int j = 0; j < departamentoLetraPiso.length; j++) {
                    departamentos.add(new Departamento((byte) i, departamentoLetraPiso[j], 70));
                }
            }
        }
    }

    public void mostrarPH(PH ph) throws ErrorLote {

        if (ph.cantidadDepartamentosPorPiso == 0) {
            if (ph.cantidadPisos > 0) {
                for (int i = 0; i < cantidadPisos; i++) {
                    for (int j = 0; j < departamentoLetra.length; j++) {
                        System.out.println("Piso: " + i + "- Dpto: " + departamentoLetra[j]);
                    }
                }
            } else {
                throw new ErrorLote("A su edificio le faltan piso");
            }
        } else {
            if (ph.cantidadPisos > 0) {
                for (int i = 0; i < cantidadPisos; i++) {
                    for (int j = 0; j < departamentoLetraPiso.length; j++) {
                        System.out.print("Piso: " + i + "- Dpto: " + departamentoLetraPiso[j] + "\n");
                    }
                }
            } else {
                throw new ErrorLote("A su edificio le faltan piso");
            }
        }
    }
}
