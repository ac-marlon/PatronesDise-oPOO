package parqueaderofabricaabstracta;

public class TarifaBicicleta extends TarifaAbstracta {

    private final int tarifaBiciVIP = 35;
    private final int tarifaBiciFrec = 30;
    private final int tarifaBiciOcas = 34;

    public TarifaBicicleta(String tipoParqueadero) {
        this.definirTarifa(tipoParqueadero);
    }

    public void definirTarifa(String tipoParqueadero) {
        if (tipoParqueadero.equalsIgnoreCase("VIP")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaBiciVIP + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("frecuente")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaBiciFrec + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("ocasional")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaBiciOcas + " por minuto");
        } else {
            System.out.println("Tipo de parqueadero no valido.");
        }
    }
}
