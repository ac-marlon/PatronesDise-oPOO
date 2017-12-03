package parqueaderoobservador;

public final class GestorNotificaciones implements IParkingObservador {

    private String nombre;

    public GestorNotificaciones(String nombre) {
        this.setNombre(nombre);
        System.out.println("Observador [" + this.nombre + "] creado");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void observadoActualizado() {
        System.out.println("Observado [" + this.getNombre() + "] recibe la notificación");
    }
}
