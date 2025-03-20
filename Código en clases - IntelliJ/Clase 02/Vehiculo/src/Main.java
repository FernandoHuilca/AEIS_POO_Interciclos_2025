// Author: Fernando Huilca


public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();

        System.out.println("El vehiculo tiene como propietario a : " + vehiculo1.propietario);


        vehiculo1.propietario = "Fernando";

        System.out.println("El vehiculo tiene como propietario a : " + vehiculo1.propietario);

    }
}