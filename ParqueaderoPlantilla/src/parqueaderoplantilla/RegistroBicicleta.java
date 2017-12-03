package parqueaderoplantilla;

public class RegistroBicicleta extends Registro {

    private final String nombreCliente;
    private final String marcaVehiculo;
    private final String color;
    private final String descripcion;

    public RegistroBicicleta(String nombreCliente, String marcaVehiculo, String color, String descripcion) {
        this.nombreCliente = nombreCliente;
        this.marcaVehiculo = marcaVehiculo;
        this.color = color;
        this.descripcion = descripcion;
    }

    @Override
    public String mostrarRegistro() {
        return "\nEl vehiculo se ha registrado correctamente.\nNombre del cliente: " + this.nombreCliente + "\nMarca del vehiculo: " + this.marcaVehiculo
                + "\nColor del vehiculo: " + this.color + "\nDescripcion del vehiculo: " + this.descripcion;
    }

}
