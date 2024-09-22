/*
 * Lote
 * Versión 0.2.0
 * 2024-09-10
 * Gustavo A. Aráuz
 */

package inmuebles;

import errores.ErrorLote;

public class Lote {
    public Integer idPadron;
    public int superficie;
    public Registro inscripto;
    public Edificio construccion;

    private static int contadorLote;
    private String domicilio;
    private float avaluoPorMetroLote;
    private Edificio edificioConstruido;

    public Lote(String domicilio, int superficie){
        this.idPadron = contadorLote++;
        setDomicilio(domicilio);
        this.superficie = superficie;
    }

    public String toString(){
        return "El lote padron N° " + idPadron + " con superficie: " + superficie + " metros cuadrados, domicilio: "
                + getDomicilio() + "\nRegistrado correctamente\n\t";
    }

    public void setAvaluoPorMetroLote(float avaluoPorMetroLote){
        this.avaluoPorMetroLote = avaluoPorMetroLote;
    }

    public void imprimeAvaluo(){
        float avaluo = avaluoPorMetroLote * superficie;
        System.out.println("El avaluo fiscal del lote con padrón N° "+ idPadron +" es: " + avaluo);
    }

    public float valuar(){
        return avaluoPorMetroLote * superficie;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    // Construcción
    public void construir(Edificio edificio) throws ErrorLote{
        if (this.construccion == null){
            this.construccion = edificio;
            System.out.println("Edificio construido");
        } else {
            throw new ErrorLote("Existe un edificio en el lote. Imposible construir un nuevo edificio");
        }
    }

}
