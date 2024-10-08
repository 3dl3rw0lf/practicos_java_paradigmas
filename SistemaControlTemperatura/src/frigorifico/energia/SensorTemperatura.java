/*
 * Project: SistemaControlTemperatura
 * Package: frigorifico.energia
 * Class: SensorTemperatura
 * Version: 1.0
 * Date: 14/09/2024 18:21
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */
package frigorifico.energia;

public class SensorTemperatura {
    private String ubicacion;
    private Double temperaturaActual;

    public SensorTemperatura(String ubicacion, Double temperaturaActual) {
        this.ubicacion = ubicacion;
        this.temperaturaActual = temperaturaActual;
    }
}
