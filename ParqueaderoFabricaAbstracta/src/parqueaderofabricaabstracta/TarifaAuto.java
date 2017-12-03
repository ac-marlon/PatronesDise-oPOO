package parqueaderofabricaabstracta;

public class TarifaAuto extends TarifaAbstracta {

    private final int tarifaAutoVIP = 65;
    private final int tarifaAutoFrec = 62;
    private final int tarifaAutoOcas = 63;

    public TarifaAuto(String tipoParqueadero) {
        this.definirTarifa(tipoParqueadero);
    }

    public void definirTarifa(String tipoParqueadero) {
        if (tipoParqueadero.equalsIgnoreCase("VIP")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaAutoVIP + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("frecuente")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaAutoFrec + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("ocasional")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaAutoOcas + " por minuto");
        } else {
            System.out.println("Tipo de parqueadero no valido.");
        }
    }

}
