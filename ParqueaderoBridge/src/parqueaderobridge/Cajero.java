package parqueaderobridge;

public class Cajero implements ICargo {

    private final String nombreE;

    public Cajero(String nombreE) {
        this.nombreE = nombreE;
    }

    @Override
    public String añadir() {
        return "Se ha añadido a " + this.nombreE + " como Cajero.";
    }

}
