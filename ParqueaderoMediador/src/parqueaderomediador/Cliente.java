package parqueaderomediador;

public class Cliente {

    public static void main(String[] args) {

        AppMovilParking appMovParking = new AppMovilParking();
        UsuarioApp appCliente = new UsuarioAppCliente(appMovParking);
        UsuarioApp appAdmin = new UsuarioAppAdmin(appMovParking);
        appMovParking.agregarUsuarioApp(appCliente);
        appMovParking.agregarUsuarioApp(appAdmin);
        appAdmin.comunicar("¡Administrador ha notificado un cierre temporal\n"
                + "del parqueadero por razones de remodelamiento de las instalaciones!");

    }
}
