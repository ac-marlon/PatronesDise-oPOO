package parqueaderoproxy;

public class HistorialClientesProxy implements IHistorialClientes {

    HistorialClientes hc = new HistorialClientes();

    @Override
    public String accederHistorial(String usuario) {
        if (usuario.equalsIgnoreCase("gabriela")) {
            return hc.accederHistorial(usuario);
        } else {
            return "Usuario sin permisos";
        }
    }

}
