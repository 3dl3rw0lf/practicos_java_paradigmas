/*
 * Project: SistemaControlTemperatura
 * Package: frigorifico.camaras
 * Class: CamaraFluctuante
 * Version: 1.0
 * Date: 14/09/2024 18:20
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */
package frigorifico.camaras;

public class CamaraFluctuante extends Camara{
    private Double temperaturaMaxima;
    private Double temperaturaMinima;

    public CamaraFluctuante(String nombre, Double volumen, Double temperaturaMinima, Double temperaturaMaxima){
        super(nombre, volumen);
        setTemperaturaMaxima(temperaturaMinima);
        setTemperaturaMinima(temperaturaMaxima);
    }

    public void establecerLecturaSensor(String ubicacion, Double temperatuaActual ){

    }

    public Boolean eliminarLecturaSensor(String ubicacion, Double temperatuaActual){
        return false;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public void calcularEnergia(Double temperaturaDeseada) {
        double temperaturaTotal = temperaturaActual - temperaturaDeseada;

        this.cantidadEnergia = temperaturaTotal * volumen;
    }
}
