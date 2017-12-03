package parqueaderomediador;

public class UsuarioAppAdmin extends UsuarioApp {

    public UsuarioAppAdmin(IAppMovil appMovil) {
        this.setAppMovil(appMovil);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Usuario (cliente) de la App: " + mensaje);
    }
}
