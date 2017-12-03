package parqueaderocomando;

import java.util.ArrayList;

public class Invocador {

    private final ArrayList<IComando> aComando = new ArrayList<>();

    public void añadir(IComando comando) {

        this.aComando.add(comando);
    }

    public IComando getComando(int opcion) {

        return this.aComando.get(opcion);
    }
}
