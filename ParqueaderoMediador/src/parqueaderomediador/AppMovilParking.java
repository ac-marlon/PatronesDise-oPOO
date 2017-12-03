package parqueaderomediador;

import java.util.ArrayList;

public class AppMovilParking implements IAppMovil {

    private final ArrayList<UsuarioApp> usuariosApp;

    public AppMovilParking() {
        this.usuariosApp = new ArrayList<>();
    }

    public void agregarUsuarioApp(UsuarioApp usuarioApp) {
        this.usuariosApp.add(usuarioApp);
    }

    @Override
    public void enviar(String mensaje, UsuarioApp emisor) {
        usuariosApp.stream().filter((usuarioApp) -> (usuarioApp != emisor)).forEachOrdered((usuarioApp) -> {
            usuarioApp.recibir(mensaje);
        });
    }
}
