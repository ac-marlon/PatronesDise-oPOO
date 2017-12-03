package parqueaderofabricaabstracta;

public class FabricaParqueaderoMoto implements FabricaAbstractaParqueadero {

    @Override
    public TarifaAbstracta definirTarifa(String tipoParqueadero) {
        return new TarifaMoto(tipoParqueadero);
    }

}
