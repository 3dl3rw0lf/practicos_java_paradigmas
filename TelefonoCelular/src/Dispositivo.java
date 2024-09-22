/*
 * Project: TelefonoCelular
 * Package: PACKAGE_NAME
 * Class: Dispositivo
 * Version: 1.0
 * Date: 17/09/2024 18:22
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */

public abstract class Dispositivo {
    private Integer numeroSerie;

    public abstract void Encender();

    public abstract void Apagar();

    public void MostrarInfo(){
        System.out.println("Numero Serie: " + numeroSerie);
    }
}
