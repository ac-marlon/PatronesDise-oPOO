package parqueaderopesoligero;

public class FacturaCarro implements IFactura {

    private final String nombreCliente;
    private final String marcaCarro;
    private final String modeloCarro;
    private final String placaCarro;
    private final int bahia;
    private final int tiempoMinutos;
    private final int tarifa = 65;

    public FacturaCarro(int bahia, String nombreCliente, String marcaCarro, String modeloCarro, String placaCarro, int tiempoMinutos) {
        this.bahia = bahia;
        this.nombreCliente = nombreCliente;
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.placaCarro = placaCarro;
        this.tiempoMinutos = tiempoMinutos;
    }

    @Override
    public String mostrarFactura() {
        int total = tiempoMinutos * tarifa;
        return "\nLa factura ha sido generada.\nNumero de la bahia: " + this.bahia + "\nNombre del cliente: " + this.nombreCliente
                + "\nMarca del auto: " + this.marcaCarro + "\nModelo del auto: " + this.modeloCarro + "\nPlaca: " + this.placaCarro
                + "Tiempo en el parqueadero (minutos): " + this.tiempoMinutos + "\nTOTAL A PAGAR: " + total;
    }

}
