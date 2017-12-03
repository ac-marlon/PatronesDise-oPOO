package parqueaderomediador;

public abstract class UsuarioApp {

    protected IAppMovil appMovil;

    public IAppMovil getAppMovil() {
        return this.appMovil;
    }

    public void setAppMovil(IAppMovil appMovil) {
        this.appMovil = appMovil;
    }

    public void comunicar(String mensaje) {
        this.getAppMovil().enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
