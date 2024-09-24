/*
 * Project: SistemaControlTemperatura
 * Package: frigorifico.camaras
 * Class: CamaraEstable
 * Version: 1.0
 * Date: 14/09/2024 18:20
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */
package frigorifico.camaras;

import frigorifico.errores.NivelAislacionIncorrecto;

public class CamaraEstable extends Camara{
    private Integer cantidadPuertas;
    private Integer nivelAislacion;

    public CamaraEstable(String nombre, Double volumen, int cantidadPuertas, int nivelAislacion)
            throws NivelAislacionIncorrecto {
        super(nombre, volumen);
        this.cantidadPuertas = cantidadPuertas;
        setNivelAislacion(nivelAislacion);
    }

    public void setNivelAislacion(Integer nivelAislacion) throws NivelAislacionIncorrecto {
        if (nivelAislacion < 1 || nivelAislacion > 5) {
            throw new NivelAislacionIncorrecto("El nivel de aislación es incorrecto. El rango de valores permitidos es entre 1 y 5.");
        }
        this.nivelAislacion = nivelAislacion;
    }

    @Override
    public void calcularEnergia(Double temperaturaDeseada) {
        Double temperaturaActual = 2.0;

        this.cantidadEnergia = nivelAislacion * (temperaturaActual - temperaturaDeseada) * volumen;
    }
}
