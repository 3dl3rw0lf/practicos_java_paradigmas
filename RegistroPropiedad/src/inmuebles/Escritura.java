/*
 * Escritura
 * Versión 0.2.0
 * 2024-09-10
 * Gustavo A. Aráuz
 */

package inmuebles;

import java.io.*;

public class Escritura implements Serializable {
    public Integer numero;
    public int superficie;

    private String domicilio;

    private static int contador = 1;

    public Escritura(int superficie, String domicilio) {
        this.numero = contador++;
        this.superficie = superficie;
        setDomicilio(domicilio);
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public String setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return null;
    }

    public void mostrarEscritura() {
        System.out.println("****************************");
        System.out.println("*     DETALLE ESCRITURA    *");
        System.out.println("****************************");
        System.out.println("Escritura N° "+ this.numero);
        System.out.println("Superficie "+ this.superficie + " m²");
        System.out.println("Domicilio "+ getDomicilio());
        System.out.println("****************************\n");
    }

    public void  guardarEscritura(Integer numero) throws IOException {
        File file = new File(numero +".dat");
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            System.out.println("Escritura guardada correctamente en " + file.getName());
        }
        catch (IOException exception){
            System.out.println("Error al guardar escritura: " + exception.getMessage());
        }
    }

    public static Escritura recuperarEscritura(Integer numero) throws IOException {
        Escritura escritura = null;
        File file = new File(numero + ".dat");
        if (file.exists()){
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);

                escritura = (Escritura) ois.readObject();
                escritura.mostrarEscritura();
            }
            catch (ClassNotFoundException exception){
                System.out.println("Error al recuperar escritura" + exception.getMessage());
            }
            catch (Exception exception) {
                System.out.println("Error al recuperar escritura" + exception.getMessage());
            }
        } else {
        System.out.println("No se encontró el archivo para la escritura número " + numero);
    }
        return escritura;
        }
}
