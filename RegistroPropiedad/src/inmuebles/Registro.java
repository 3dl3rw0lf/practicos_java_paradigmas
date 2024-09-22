/*
 * Registro
 * Versión 0.1.0
 * 2024-09-10
 * Gustavo A. Aráuz
 */

package inmuebles;

import java.util.ArrayList;
import java.util.ListIterator;

public class Registro {
    public static float coeficienteAvaluoEdificio;
    public String municipio;

    public Lote inmueble[];
    public ArrayList<Lote> inmuebleAL;
    public ArrayList<Escritura> escrituras = new ArrayList<>();
    private float tasa;

    public Registro(){
        this.inmuebleAL = new ArrayList<>();
    }

    public Escritura registrar(Lote lote){
        inmuebleAL.add(lote);
        lote.inscripto = this;
        Escritura escritura = new Escritura(lote.superficie, lote.getDomicilio());
        escrituras.add(escritura);
        return escritura;
    }

    public void setTasa(float tasa){
        this.tasa = tasa;
    }

    public float getTasa(){
        return tasa;
    }

    /*
     * Métodos sin implementación
     * public void setCoeficienteAvaluoEdificio(){
     * }
     *
     * public float getCoeficienteAvaluoEdificio(){
     *    return ;
     * }
     */

    public float valuar(Lote lote){
        return lote.valuar();
    }

    public void emitirBoletos(){
         /* Formas de iterar el ArrayList
          * bucle for
          * for(int i = 0; i < inmuebleAL.size(); i++){
          *   System.out.println("El lote está en " + inmuebleAL.get(i).getDomicilio());
          * }
          * bucle foreach
          * for(Lote lote : inmuebleAL){
          *    System.out.println("Lote ubicado en "+ lote.getDomicilio() + " tiene una superficie de " + lote.superficie + " metros cuadrados" );
          * }
          */
        // Método listIterator()
        ListIterator<Lote> listIterator = inmuebleAL.listIterator();
        while(listIterator.hasNext()){
            Lote lote = listIterator.next();

            System.out.println("El lote ubicado en " + lote.getDomicilio() + " tiene una superficie de " +
                    lote.superficie + " metros cuadrados");
        }
    }
}
