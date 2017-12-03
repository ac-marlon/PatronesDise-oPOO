package parqueaderobuilder;

public class NivelOcasional extends BuilderNivel {

    @Override
    public void construirBahias() {
        this.nivel.setBahia("Se han construido 13 bahías para clientes Ocasionales");
    }

    @Override
    public void construirCamaras() {
        this.nivel.setCamara("Se han instalado 5 camaras de seguridad en putos estratégicos en el parqueadero para clientes Ocasionales");
    }

    @Override
    public void construirSalidasEmergencia() {
        this.nivel.setSalidaEmergencia("Se han instalado 3 salidas de emergencia");
    }

}
