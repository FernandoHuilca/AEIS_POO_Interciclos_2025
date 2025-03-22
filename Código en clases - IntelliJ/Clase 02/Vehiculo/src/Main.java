// Author: Fernando Huilca


public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("El vehiculo tiene como propietario a : " + vehiculo1.getPropietario());

        vehiculo1.setPropietario("Fernando");


        System.out.println("El vehiculo tiene como propietario a : " + vehiculo1.getPropietario());

        System.out.println(vehiculo1.getVelocidad());
        vehiculo1.acelerar();



    }
}