package parqueaderoobservador;

import java.util.ArrayList;

public abstract class ObservacionEventos {

    private final ArrayList<IParkingObservador> observadorEventos = new ArrayList<>();

    public ObservacionEventos() {
    }

    public void agregarObservador(IParkingObservador observadorParkAgre) {
        observadorEventos.add(observadorParkAgre);
        notificarObservadoresParqueadero();
    }

    public void eliminarObservador(IParkingObservador observadorParkElim) {
        observadorEventos.remove(observadorParkElim);
    }

    public void notificarObservadoresParqueadero() {
        observadorEventos.forEach((notifacion) -> {
            notifacion.observadoActualizado();
        });
    }
}
