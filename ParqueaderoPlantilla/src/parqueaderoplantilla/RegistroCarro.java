package parqueaderoplantilla;

public class RegistroCarro extends Registro {

    private final String nombreCliente;
    private final String marcaVehiculo;
    private final String color;
    private final String placa;

    public RegistroCarro(String nombreCliente, String marcaVehiculo, String color, String placa) {
        this.nombreCliente = nombreCliente;
        this.marcaVehiculo = marcaVehiculo;
        this.color = color;
        this.placa = placa;
    }

    @Override
    public String mostrarRegistro() {
        return "\nEl vehiculo se ha registrado correctamente.\nNombre del cliente: " + this.nombreCliente + "\nMarca del vehiculo: " + this.marcaVehiculo
                + "\nColor del vehiculo: " + this.color + "\nPlaca del vehiculo: " + this.placa;
    }

}
