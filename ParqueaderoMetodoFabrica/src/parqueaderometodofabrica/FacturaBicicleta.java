package parqueaderometodofabrica;

public class FacturaBicicleta extends Factura {

    public FacturaBicicleta(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente, double tiempoServicio, int impuestos, int valor, String tipoVehiculo) {
        super(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
    }

    @Override
    public double totalPagar() {
        double total;
        return total = ((4350 * 0.19) + 4250);
    }

    @Override
    public String imprimir() {
        return "Factura para Bicicleta";
    }

}
