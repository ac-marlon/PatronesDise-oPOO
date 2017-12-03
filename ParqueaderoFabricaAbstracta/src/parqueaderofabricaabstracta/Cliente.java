package parqueaderofabricaabstracta;

public class Cliente {

    public Cliente(FabricaAbstractaParqueadero tipo, String tipoParqueadero) {

        TarifaAbstracta tarifa = tipo.definirTarifa(tipoParqueadero);
    }
}
