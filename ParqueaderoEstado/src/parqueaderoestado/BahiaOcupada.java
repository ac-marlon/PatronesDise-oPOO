package parqueaderoestado;

public class BahiaOcupada implements EstadoBahia {

    String estadoOcu = "La bahia se encuentra ocupada. ¡Por favor intente mas tarde!";

    @Override
    public String manejadorBahia() {

        return estadoOcu;
    }

}
