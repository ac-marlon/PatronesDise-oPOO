package parqueaderoestado;

public class BahiaMantenimiento implements EstadoBahia {

    String estadoMant = "La bahia se encunetra en mantenimiento. ¡Por favor intente en otra!";

    @Override
    public String manejadorBahia() {

        return estadoMant;
    }

}
