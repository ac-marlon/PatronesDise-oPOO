package parqueaderopesoligero;

public class FacturaMoto implements IFactura {

    private final String nombreCliente;
    private final String marcaMoto;

    private final String modeloMoto;
    private final String placaMoto;
    private final int bahia;
    private final int tiempoMinutos;
    private final int tarifa = 45;

    public FacturaMoto(int bahia, String nombreCliente, String marcaMoto, String modeloMoto, String placaMoto, int tiempoMinutos) {
        this.bahia = bahia;
        this.nombreCliente = nombreCliente;
        this.marcaMoto = marcaMoto;
        this.modeloMoto = modeloMoto;
        this.placaMoto = placaMoto;
        this.tiempoMinutos = tiempoMinutos;
    }

    @Override
    public String mostrarFactura() {
        int total = tiempoMinutos * tarifa;
        return "\nLa factura ha sido generada.\nNumero de la bahia: " + this.bahia + "\nNombre del cliente: " + this.nombreCliente
                + "\nMarca de la moto: " + this.marcaMoto + "\nModelo de la moto: " + this.modeloMoto + "\nPlaca: " + this.placaMoto
                + "Tiempo en el parqueadero (minutos): " + this.tiempoMinutos + "\nTOTAL A PAGAR: " + total;
    }

}
