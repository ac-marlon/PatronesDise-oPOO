package parqueaderobridge;

public abstract class Personal {

    ICargo c;
    String nombre;

    public ICargo getC() {
        return this.c;
    }

    public void setC(ICargo c) {
        this.c = c;
    }

    public abstract String añadir();
}
