package parqueaderometodofabrica;

public interface FacturaFactoryMethod {

    public Factura generarFactura(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente,
            double tiempoServicio, int impuestos, int valor, String tipoVehiculo);
}
