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

    private final Integer idCamara;
    private static int idContador = 1;

    public Camara(String nombre, Double volumen) {
        this.idCamara = ++idContador;
        this.nombre = nombre;
        this.volumen = volumen;
    }

    public void calcularEnergia(Double temperaturaDeseada){}

    public void mostrarDatosAjusteTemperatura(){}

    public void ajustarTemperatura(){}

}
