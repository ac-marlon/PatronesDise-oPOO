package parqueaderodecorador;

public class Parqueadero implements IParqueadero {

    @Override
    public String parquear(int bahia, String tipoVehiculo) {
        return "Se ha parqueado " + tipoVehiculo + "en la bahia " + bahia;
    }

}
