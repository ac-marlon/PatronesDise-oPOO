package parqueaderofabricaabstracta;

public class FabricaParqueaderoCarro implements FabricaAbstractaParqueadero {

    @Override
    public TarifaAbstracta definirTarifa(String tipoParqueadero) {
        return new TarifaAuto(tipoParqueadero);
    }

}
