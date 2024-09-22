import errores.ErrorLote;
import inmuebles.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ErrorLote, IOException {
        Lote loteUTN = new Lote("Coronel Rodriguez 273", 24700);
        Lote loteUNCuyo = new Lote("Orzali S/N", 3943094);

        System.out.println(loteUTN.toString());
        System.out.println(loteUNCuyo.toString());

        Registro capital = new Registro();

        capital.registrar(loteUTN);
        capital.registrar(loteUNCuyo);

        loteUTN.setAvaluoPorMetroLote(3.7f);

        System.out.println(loteUTN.valuar());

        Registro.coeficienteAvaluoEdificio = 100;
        capital.municipio = "Capital Mza";
        System.out.println("La tasa de caoutal es " + capital.getTasa());

        Escritura uncEscritura = capital.registrar(loteUNCuyo);
        uncEscritura.mostrarEscritura();

        Escritura utnEscritura = capital.registrar(loteUTN);
        utnEscritura.mostrarEscritura();

        uncEscritura.guardarEscritura(uncEscritura.numero);
        uncEscritura.recuperarEscritura(uncEscritura.numero);

        utnEscritura.guardarEscritura(utnEscritura.numero);
        utnEscritura.recuperarEscritura(utnEscritura.numero);

        capital.emitirBoletos();

        PH dptos = new PH(7.3f, (byte) 4, (byte) 2);
        PH dpto = new PH(7.3f, (byte) 4);

        dptos.mostrarPH(dptos);

        dpto.mostrarPH(dpto);

        //TODO: hacer try catch
        //catch tienen que ir de los más específico ha lo más amplio
        try {
            Lote field = new Lote( "Av. España 2330", 4000);
            field.construir(new Edificio(5));

            field.construir(new Edificio(7));
            System.out.println("por acá");
        }
        catch (ErrorLote error){
            System.out.println(error.getMessage());
        }
    }

}
