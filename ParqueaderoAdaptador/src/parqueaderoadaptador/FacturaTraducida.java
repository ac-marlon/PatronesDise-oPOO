package parqueaderoadaptador;

public class FacturaTraducida extends FacturaEspañol {

    FacturaIngles factIngles = new FacturaIngles();

    @Override
    public void traducirFactura() {
        factIngles.traducir();
    }

    @Override
    public void facturaOriginal() {
        factIngles.facturaOriginal();
    }
}
