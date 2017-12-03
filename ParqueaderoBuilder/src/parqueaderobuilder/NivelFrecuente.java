package parqueaderobuilder;

public class NivelFrecuente extends BuilderNivel {

    @Override
    public void construirBahias() {
        this.nivel.setBahia("Se han construido 22 bahías para un cliente Frecuente");
    }

    @Override
    public void construirCamaras() {
        this.nivel.setCamara("Se han instalado 5 cámaras en los puntos estratégicos del parqueadero para clientes Frecuentes");
    }

    @Override
    public void construirSalidasEmergencia() {
        this.nivel.setSalidaEmergencia("Se han instalado 3 salidas de emergencia");
    }

}
