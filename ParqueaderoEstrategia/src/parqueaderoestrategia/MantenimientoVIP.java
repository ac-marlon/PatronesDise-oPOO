package parqueaderoestrategia;

public class MantenimientoVIP implements IMantenimiento {

    private final String iluminacionLED;
    private final String espacioDoble;
    private final String techoTeja;
    private final String estadoIluminacion;
    private final String estadoEspacio;
    private final String estadoTecho;

    public MantenimientoVIP(String iluminacionLED, String espacioDoble, String techoTeja, String estadoIluminacion, String estadoEspacio, String estadoTecho) {

        this.iluminacionLED = iluminacionLED;
        this.espacioDoble = espacioDoble;
        this.techoTeja = techoTeja;
        this.estadoIluminacion = estadoIluminacion;
        this.estadoEspacio = estadoEspacio;
        this.estadoTecho = estadoTecho;
    }

    @Override
    public boolean Limpiar() {

        boolean limpio = false;
        if (iluminacionLED != null) {
            limpio = true;
        }
        if (espacioDoble != null) {
            limpio = true;
        }
        if (techoTeja != null) {
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
        if (estadoTecho != null) {
            repara = true;
        }
        return repara;
    }

}
