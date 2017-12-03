package parqueaderodecorador;

public class DecoradorLavaderoAuto extends DecoradorLavadero {

    public DecoradorLavaderoAuto(IParqueadero parqueadero) {
        super(parqueadero);
    }

    @Override
    public String parquear(int bahia, String tipoParqueadero) {

        this.getParqueadero().parquear(bahia, tipoParqueadero);
        if (tipoParqueadero.equalsIgnoreCase("auto")) {
            return this.lavarVehiculo();
        } else {
            return "Imposible acceder a la peticion";
        }
    }

    public String lavarVehiculo() {
        return "Su vehiculo está en la zona de lavado";
    }
}
