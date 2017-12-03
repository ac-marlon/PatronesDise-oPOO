package parqueaderometodofabrica;

public class FacturaMoto extends Factura {

    public FacturaMoto(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente, double tiempoServicio, int impuestos, int valor, String tipoVehiculo) {
        super(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
    }

    @Override
    public double totalPagar() {
        double total;
        return total = ((8900 * 0.19) + 8900);
    }

    @Override
    public String imprimir() {
        return "Factura para Moto";
    }

}
