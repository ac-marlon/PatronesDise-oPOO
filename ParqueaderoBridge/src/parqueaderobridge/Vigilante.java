package parqueaderobridge;

public class Vigilante implements ICargo {

    private final String nombreE;

    public Vigilante(String nombreE) {
        this.nombreE = nombreE;
    }

    @Override
    public String añadir() {
        return "El empleado " + this.nombreE + " ha sido añadido como Vigilante.";
    }

}
