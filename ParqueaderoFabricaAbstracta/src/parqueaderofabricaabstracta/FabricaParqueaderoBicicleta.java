package parqueaderofabricaabstracta;

public class FabricaParqueaderoBicicleta implements FabricaAbstractaParqueadero {

    @Override
    public TarifaAbstracta definirTarifa(String tipoParqueadero) {
        return new TarifaBicicleta(tipoParqueadero);
    }

}
