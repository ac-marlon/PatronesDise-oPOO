package parqueaderopesoligero;

public class FlyweightFactory {

    IFactura carro;
    IFactura moto;
    IFactura bici;

    public void facturarCarros(int opc, int bahia[], String nombreCliente[], String marca[], String modelo[], String placa[], int tiempoMin[]) {
        for (int i = 0; i < opc; i++) {

            carro = new FacturaCarro(bahia[i], nombreCliente[i], marca[i], modelo[i], placa[i], tiempoMin[i]);
            System.out.println("Detalle de factura\n" + carro.mostrarFactura());
            System.out.println("____________________________________");
        }
    }

    public void facturarMotos(int opc, int bahia[], String nombreCliente[], String marca[], String modelo[], String placa[], int tiempoMin[]) {

        for (int j = 0; j < opc; j++) {

            moto = new FacturaMoto(bahia[j], nombreCliente[j], marca[j], modelo[j], placa[j], tiempoMin[j]);
            System.out.println("Datos de factura\n" + moto.mostrarFactura());
            System.out.println("____________________________________");
        }
    }

    public void facturarBicicletas(int opc, int bahia[], String nombreCliente[], String marca[], String color[], int tiempoMin[]) {

        for (int i = 0; i < opc; i++) {

            bici = new FacturaBici(bahia[i], nombreCliente[i], marca[i], color[i], tiempoMin[i]);
            System.out.println("Detalle factura\n" + bici.mostrarFactura());
            System.out.println("____________________________________");
        }
    }
}
