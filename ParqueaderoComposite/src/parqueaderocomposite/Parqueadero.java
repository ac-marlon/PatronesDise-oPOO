package parqueaderocomposite;

import java.util.*;

public class Parqueadero extends AbstractCompositor {

    List<AbstractCompositor> compositor;

    public Parqueadero() {
        compositor = new ArrayList<AbstractCompositor>();
    }

    @Override
    public String agregarNiveles(AbstractCompositor composicion) {
        this.compositor.add(composicion);
        return "Nivel agregado al parqueadero";
    }

    @Override
    public String agregarAreaServicio(AbstractCompositor composicion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
