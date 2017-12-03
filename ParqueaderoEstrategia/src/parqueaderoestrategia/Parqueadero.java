package parqueaderoestrategia;

public class Parqueadero {

    private final IMantenimiento mantenimiento;

    public Parqueadero(IMantenimiento mantenimiento) {

        this.mantenimiento = mantenimiento;
    }

    public boolean procesoLimpiar() {
        return mantenimiento.Limpiar();
    }

    public boolean procesoReparar() {
        return mantenimiento.Reparar();
    }
}
