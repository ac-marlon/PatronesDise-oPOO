package parqueaderocomposite;

import java.util.*;

public class Niveles extends AbstractCompositor {

    private List<AbstractCompositor> composicion;

    public Niveles() {
        composicion = new ArrayList<AbstractCompositor>();
    }

    @Override
    public String agregarAreaServicio(AbstractCompositor composicion) {
        this.composicion.add(composicion);
        return "Zona de servicio agregada a los niveles";
    }

    @Override
    public String agregarNiveles(AbstractCompositor composicion) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
