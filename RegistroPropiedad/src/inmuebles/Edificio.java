/*
 * Edificio
 * Versión 0.1.0
 * 2024-09-10
 * Gustavo A. Aráuz
 */

package inmuebles;

public class Edificio {
    private static float avaluoPorMetroEdificio;

    public Edificio(float avaluoPorMetroEdificio){
        this.avaluoPorMetroEdificio = avaluoPorMetroEdificio;
    }

    public float avaluoPorMetroEdificio(Lote unLote){
        return unLote.superficie * avaluoPorMetroEdificio;
    }

}
