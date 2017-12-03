package parqueaderobuilder;

public class NivelesVIP extends BuilderNivel {

    @Override
    public void construirBahias() {
        this.nivel.setBahia("Se han construido 50 bahías para un cliente VIP");
    }

    @Override
    public void construirCamaras() {
        this.nivel.setCamara("Se han instalado 9 cámaras en los puntos estratégicos en el parqueadero VIP");
    }

    @Override
    public void construirSalidasEmergencia() {
        this.nivel.setSalidaEmergencia("Se han construido 4 salidas de emergencia");
    }

}
