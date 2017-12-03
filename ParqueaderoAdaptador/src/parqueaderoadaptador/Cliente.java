package parqueaderoadaptador;

public class Cliente {

    public static void main(String args[]) {
        
        Factura factura = new FacturaEspañol();
        factura.traducirFactura();
        factura.facturaOriginal();
        Factura facturaTrad = new FacturaTraducida();
        facturaTrad.traducirFactura();
        facturaTrad.facturaOriginal();
    }
}
