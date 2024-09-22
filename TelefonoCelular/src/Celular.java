/*
 * Project: TelefonoCelular
 * Package: PACKAGE_NAME
 * Class: Celular
 * Version: 1.0
 * Date: 17/09/2024 18:24
 * Author: Gustavo Aráuz
 * Copyright (c) 2024
 */

public class Celular extends Dispositivo {
    private boolean encendido;
    public Bateria bateria;
    public UnidadModular unidadModular;

    public Celular(Bateria bateria){
        super();
        unidadModular = new UnidadModular();
        this.bateria = bateria;
        this.encendido = false;
    }

    public void colocar(Bateria bateria){
        this.bateria = bateria;
    }

    public void Encender(){
        this.encendido = true;
        System.out.println("Se encendió el celular");
    }

    public void Apagar(){
        System.out.println("Apagando celular");
        System.out.println("...");
        System.out.println("..");
        System.out.println(".");
        System.out.println("Dispositivo apagado");
        this.encendido = false;
    }

    public void MostrarInfo(){

    }


}
