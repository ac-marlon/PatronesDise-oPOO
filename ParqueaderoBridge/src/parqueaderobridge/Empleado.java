package parqueaderobridge;

public class Empleado extends Personal {

    public Empleado(ICargo c) {
        this.setC(c);
    }

    @Override
    public String añadir() {
        return this.getC().añadir();
    }

}
