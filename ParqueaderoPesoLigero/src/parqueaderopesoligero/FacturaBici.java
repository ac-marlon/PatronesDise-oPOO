package parqueaderopesoligero;

public class FacturaBici implements IFactura {

    private final String nombreCliente;

    private final String marcaBici;
    private final String colorBici;
    private final int bahia;
    private final int tiempoMinutos;
    private final int tarifa = 35;

    public FacturaBici(int bahia, String nombreCliente, String marcaBici, String colorBici, int tiempoMinutos) {
        this.bahia = bahia;
        this.nombreCliente = nombreCliente;
        this.marcaBici = marcaBici;
        this.colorBici = colorBici;
        this.tiempoMinutos = tiempoMinutos;
    }

    @Override
    public String mostrarFactura() {
        int total = tiempoMinutos * tarifa;
        return "\nLa factura ha sido generada.\nNumero de bahia: " + this.bahia + "\nNombre del cliente: " + this.nombreCliente
                + "\nMarca de la bicicleta: " + this.marcaBici + "\nColor de la bicicleta: " + this.colorBici + "\nTiempo en el parqueadero (minutos): "
                + this.tiempoMinutos + "\nTOTAL A PAGAR: " + total;
    }

}
