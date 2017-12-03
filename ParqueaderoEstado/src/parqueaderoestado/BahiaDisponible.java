package parqueaderoestado;

public class BahiaDisponible implements EstadoBahia {

    String estadoDisp = "La bahia esta lista para ser ocupada. ¡Gracias!";

    @Override
    public String manejadorBahia() {

        return estadoDisp;
    }

}
