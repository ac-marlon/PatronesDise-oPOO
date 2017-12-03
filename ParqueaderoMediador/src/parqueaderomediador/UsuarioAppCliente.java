package parqueaderomediador;

public class UsuarioAppCliente extends UsuarioApp {

    public UsuarioAppCliente(IAppMovil appMovil) {
        this.setAppMovil(appMovil);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Usuario (cliente) de la App: " + mensaje);
    }
}
