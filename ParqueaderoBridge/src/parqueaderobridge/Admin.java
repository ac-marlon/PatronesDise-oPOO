package parqueaderobridge;

public class Admin implements ICargo {

    private final String nombreE;

    public Admin(String nombreE) {
        this.nombreE = nombreE;
    }

    @Override
    public String añadir() {
        return "El empleado " + this.nombreE + " se ha añadido al cargo de Administrador correctamente";
    }
}
