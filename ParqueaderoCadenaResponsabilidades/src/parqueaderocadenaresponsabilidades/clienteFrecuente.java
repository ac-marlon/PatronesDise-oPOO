package parqueaderocadenaresponsabilidades;

public class clienteFrecuente extends clienteBahia {

    @Override
    public String disponibilidad(String estado) {

        String cad = null;
        if ((estado != null) && (estado.equalsIgnoreCase("2") == true)) {
            cad = "En el sótano 2, hay bahías disponibles para un cliente frecuente";
        } else {
            if (this.getSiguiente() != null) {
                this.getSiguiente().disponibilidad(estado);
            }
        }
        return cad;
    }

}
