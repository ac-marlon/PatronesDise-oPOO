package parqueaderoestrategia;

public class MantenimientoOcasional implements IMantenimiento {

    private final String iluminacionConvensional;
    private final String espacioSencillo;
    private final String estadoIluminacion;
    private final String estadoEspacio;

    public MantenimientoOcasional(String iluminacionConvensional, String espacioSencillo, String estadoIluminacion, String estadoEspacio) {

        this.iluminacionConvensional = iluminacionConvensional;
        this.espacioSencillo = espacioSencillo;
        this.estadoIluminacion = estadoIluminacion;
        this.estadoEspacio = estadoEspacio;
    }

    @Override
    public boolean Limpiar() {

        boolean limpio = false;
        if (iluminacionConvensional != null) {
            limpio = true;
        }
        if (espacioSencillo != null) {
            limpio = true;
        }
        return limpio;
    }

    @Override
    public boolean Reparar() {

        boolean repara = false;
        if (estadoIluminacion != null) {
            repara = true;
        }
        if (estadoEspacio != null) {
            repara = true;
        }
        return repara;
    }

}
