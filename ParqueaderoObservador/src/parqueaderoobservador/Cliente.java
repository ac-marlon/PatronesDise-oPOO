package parqueaderoobservador;

public class Cliente {

    public static void main(String[] args) {

        ParqueaderoObservado parqueaderoObservado = new ParqueaderoObservado();
        GestorNotificaciones gestorPublicidad = new GestorNotificaciones("Concierto de media noche: Parking Bogotá abierto hasta las 4:00 am");
        parqueaderoObservado.agregarObservador(gestorPublicidad);
        GestorNotificaciones gestorEventos = new GestorNotificaciones("Día festivo: servicio solo hasta las 3:00 pm");
        parqueaderoObservado.agregarObservador(gestorEventos);
        GestorNotificaciones gestorComunicaciones = new GestorNotificaciones("Día regular entre semana: horarios habituales");
        parqueaderoObservado.agregarObservador(gestorComunicaciones);
    }
}
