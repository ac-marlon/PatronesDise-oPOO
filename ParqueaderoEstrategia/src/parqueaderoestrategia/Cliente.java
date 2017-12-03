package parqueaderoestrategia;

import java.util.Scanner;

public class Cliente {

    private static String iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho;

    public static void main(String[] args) {

        Parqueadero p;
        System.out.println("Elija una opcion:\n1. Mantenimiento del parqueadero VIP\n2. Mantenimiento del parqueadero frecuente"
                + "\n3. Mantenimiento del parqueadero ocacional");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Elija una opcion:\n1. Limpiar\n2. Reparar ");
                opc = s.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Elija una opcion:\n1. Limpiar iluminacion\n2. Limpiar espacio\n3. Limpiar techo\n4. Limpiar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = "Utilizar amoniaco u alcohol";
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                boolean limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = "Barrer y limpiar el olor a gasolina (si hay)";
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = null;
                                espacio = null;
                                techo = "Mezclar agua con alcohol para lavar el tejado";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado el techo del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 4:
                                iluminacion = "Utilizar amoniaco u alcohol";
                                espacio = "Barrer y limpiar el olor a gasolina (si lo hay)";
                                techo = "Mezclar agua con alcochol para lavar el tejado";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado todo el parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    case 2:
                        System.out.println("Elija una opcion:\n1. Reparar iluminacion\n2. Reparar espacio\n3. Reparar techo\n4. Reparar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = "Cambiar el bombillo LED";
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                boolean repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible reparar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = "Cubrir huecos y deshacer manchones";
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = "Cambiar tejas";
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado el tejado del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 4:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = "Cambiar el bombillo LED";
                                estadoEspacio = "Cubrir huecos y deshacer manchones";
                                estadoTecho = "Cambiar tejas";
                                p = new Parqueadero(new MantenimientoVIP(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha limpiado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                }
                break;
            case 2:
                System.out.println("Elija una opcion:\n1. Limpiar\n2. Reparar ");
                opc = s.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Elija una opcion:\n1. Limpiar iluminacion\n2. Limpiar espacio\n3. Limpiar techo\n4. Limpiar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = "Utilizar un trapo mojado";
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                boolean limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = "Barrer ocasionalmente";
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = null;
                                espacio = null;
                                techo = "Lavar con agua";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado el techo del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 4:
                                iluminacion = "Utilizar un trapo mojado";
                                espacio = "Barrer ocasionalmente";
                                techo = "Lavar con agua";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado todo el parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    case 2:
                        System.out.println("Elija una opcion:\n1. Reparar iluminacion\n2. Reparar espacio\n3. Reparar techo\n4. Reparar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = "Cambiar el bombillo de neon";
                                estadoEspacio = null;
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                boolean repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible reparar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = "Cubrir huecos";
                                estadoTecho = null;
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                estadoTecho = "Cubrir goteras";
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado el tejado del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 4:
                                iluminacion = null;
                                espacio = null;
                                techo = null;
                                estadoIluminacion = "Cambiar el bombillo de neon";
                                estadoEspacio = "Cubrir huecoss";
                                estadoTecho = "Cubrir goteras";
                                p = new Parqueadero(new MantenimientoFrecuente(iluminacion, espacio, techo, estadoIluminacion, estadoEspacio, estadoTecho));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha limpiado todo del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                }
                break;
            case 3:
                System.out.println("Elija una opcion:\n1. Limpiar\n2. Reparar ");
                opc = s.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("Elija una opcion:\n1. Limpiar iluminacion\n2. Limpiar espacio\n3. Limpiar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = "Utilizar un trapo mojado";
                                espacio = null;
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                boolean limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = "Barrer ocasionalmente";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = "Utilizar un trapo mojado";
                                espacio = "Barrer ocasionalmente";
                                estadoIluminacion = null;
                                estadoEspacio = null;
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                limpio = p.procesoLimpiar();
                                if (limpio == true) {
                                    System.out.println("Se ha limpiado todo el parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                        }
                    case 2:
                        System.out.println("Elija una opcion:\n1. Reparar iluminacion\n2. Reparar espacio\n3. Reparar todo");
                        opc = s.nextInt();
                        switch (opc) {
                            case 1:
                                iluminacion = null;
                                espacio = null;
                                estadoIluminacion = "Cambiar el bombillo de convensional";
                                estadoEspacio = null;
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                boolean repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado la iluminacion del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible reparar");
                                }
                                break;
                            case 2:
                                iluminacion = null;
                                espacio = null;
                                estadoIluminacion = null;
                                estadoEspacio = "Cubrir huecos anuealmente";
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha reparado el espacio del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            case 3:
                                iluminacion = null;
                                espacio = null;
                                estadoIluminacion = "Cambiar el bombillo de neon";
                                estadoEspacio = "Cubrir huecoss";
                                p = new Parqueadero(new MantenimientoOcasional(iluminacion, espacio, estadoIluminacion, estadoEspacio));
                                repara = p.procesoReparar();
                                if (repara == true) {
                                    System.out.println("Se ha limpiado todo del parqueadero satisfactoriamente.");
                                } else {
                                    System.out.println("Imposible limpiar");
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                }
                break;
        }
    }

}
