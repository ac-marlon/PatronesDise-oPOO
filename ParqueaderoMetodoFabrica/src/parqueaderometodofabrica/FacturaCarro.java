package parqueaderometodofabrica;

public class FacturaCarro extends Factura {

    public FacturaCarro(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente, double tiempoServicio, int impuestos, int valor, String tipoVehiculo) {
        super(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
    }

    @Override
    public double totalPagar() {
        double total;
        return total = ((9100 * 0.19) + 9100);
    }

    @Override
    public String imprimir() {
        return "Factura para Carro";
    }

}
