package parqueaderoadaptador;

public class FacturaEspañol extends Factura {

    @Override
    public void traducirFactura() {
        System.out.println("Factura en idioma original.");
    }

    @Override
    public void facturaOriginal() {
        System.out.println("EL cliente es hispanohablante. No es necesario traducir.");
    }
}
