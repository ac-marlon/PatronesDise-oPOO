package parqueaderoestrategia;

public class MantenimientoFrecuente implements IMantenimiento {

    private final String iluminacionNeon;
    private final String espacioSencillo;
    private final String techoPrefabricado;
    private final String estadoIluminacion;
    private final String estadoEspacio;
    private final String estadoTecho;

    public MantenimientoFrecuente(String iluminacionNeon, String espacioSencillo, String techoPrefabricado, String estadoIluminacion, String estadoEspacio, String estadoTecho) {

        this.iluminacionNeon = iluminacionNeon;
        this.espacioSencillo = espacioSencillo;
        this.techoPrefabricado = techoPrefabricado;
        this.estadoIluminacion = estadoIluminacion;
        this.estadoEspacio = estadoEspacio;
        this.estadoTecho = estadoTecho;
    }

    @Override
    public boolean Limpiar() {

        boolean limpio = false;
        if (iluminacionNeon != null) {
            limpio = true;
        }
        if (espacioSencillo != null) {
            limpio = true;
        }
        if (techoPrefabricado != null) {
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
