// Pizzería ejemplo general.
public class Main {
    public static void main(String[] args) {
        Cliente fernando = new Cliente("Fernando", 21, "Macondo-Ecuador", "0912345561");
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.registrarCliente(fernando);
        pizzeria.registrarCliente(new Cliente("Camila", 19, "Guaya kill", "091234567"));
        System.out.println("La pizzeria tiene : " + pizzeria.getContadorDeClientes() + " clientes");

    }
}