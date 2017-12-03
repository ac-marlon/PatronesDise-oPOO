package parqueaderosingleton;

public class ParqueaderoSingleton {

    static ParqueaderoSingleton bahia1;
    static ParqueaderoSingleton bahia2;
    static ParqueaderoSingleton bahia3;
    private String estado;

    private ParqueaderoSingleton(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static ParqueaderoSingleton ocuparBahia(String estado) {
        if (bahia1 == null) {
            bahia1 = new ParqueaderoSingleton("Ocupando Bahia 1...");
            return bahia1;
        } else if (bahia2 == null) {
            bahia2 = new ParqueaderoSingleton("Ocupando Bahia 2...");
            return bahia2;
        } else if (bahia3 == null) {
            bahia3 = new ParqueaderoSingleton("Ocupando Bahia 3...");
            return bahia3;
        } else {
            System.out.println("Todas ocupadas. Regrese mas tarde");
        }
        return null;
    }

    public static ParqueaderoSingleton liberarBahia() {
        if (bahia1 != null) {
            bahia1 = null;
            System.out.println("Ha sido liberada (bahia 1)");
            return bahia1;
        } else if (bahia2 != null) {
            bahia2 = null;
            System.out.println("Ha sido liberada (bahia 2)");
            return bahia2;
        } else if (bahia3 != null) {
            bahia3 = null;
            System.out.println("Ha sido liberada (bahia 3)");
            return bahia3;
        } else {
            System.out.println("LIBRES TODAS");
        }
        return null;
    }

}
