/*
 * Project: SistemaControlTemperatura
 * Package: frigorifico.camaras
 * Class: Camara
 * Version: 1.0
 * Date: 14/09/2024 18:20
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */
package frigorifico.camaras;

public class Camara {
    protected String nombre;
    protected Double volumen;
    protected Double cantidadEnergia;
    protected Boolean temperatura;

    private Integer idCamara;

    public Camara() {

    }

    public void calcularEnergia(Double temperaturaDeseada){}

    public void ajustarTemperatura(){}

    public void mostrarDatosAjusteTemperatura(){}
}
