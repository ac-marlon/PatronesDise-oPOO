package parqueaderofabricaabstracta;

public class TarifaMoto extends TarifaAbstracta {

    private final int tarifaMotoVIP = 45;
    private final int tarifaMotoFrec = 43;
    private final int tarifaMotoOcas = 45;

    public TarifaMoto(String tipoParqueadero) {
        this.definirTarifa(tipoParqueadero);
    }

    public void definirTarifa(String tipoParqueadero) {
        if (tipoParqueadero.equalsIgnoreCase("VIP")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaMotoVIP + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("frecuente")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaMotoFrec + " por minuto");
        } else if (tipoParqueadero.equalsIgnoreCase("ocasional")) {
            System.out.println("\nLa tarifa a pagar de este cliente es $" + this.tarifaMotoOcas + " por minuto");
        } else {
            System.out.println("Tipo de parqueadero no valido.");
        }
    }
}
