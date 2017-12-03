package parqueaderometodofabrica;

public class FacturaFactory implements FacturaFactoryMethod {

    @Override
    public Factura generarFactura(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente, double tiempoServicio, int impuestos, int valor, String tipoVehiculo) {

        switch (tipoVehiculo.toLowerCase()) {
            case "moto":
                return new FacturaMoto(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
            case "carro":
                return new FacturaCarro(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
            case "bicicleta":
                return new FacturaBicicleta(NIT, fechaExp, horaExp, nombreCLiente, cedulaCLiente, tiempoServicio, impuestos, valor, tipoVehiculo);
            default:
                break;
        }
        return null;
    }

}
