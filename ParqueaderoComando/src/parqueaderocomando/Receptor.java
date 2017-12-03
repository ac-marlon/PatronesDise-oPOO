package parqueaderocomando;

public class Receptor {

    public String accion(String accion) {

        if (accion.compareTo("Aprobado") == 0) {
            return "El acceso al parqueadero ha sido aprobado";
        } else if (accion.compareTo("Denegado") == 0) {
            return "El acceso al parqueadero ha sido denegado";
        } else {
            return "Opción invalida";
        }
    }
}
