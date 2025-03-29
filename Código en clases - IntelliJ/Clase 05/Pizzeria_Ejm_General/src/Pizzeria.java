public class Pizzeria {
    private Cliente[] clientes;
    private int contadorClientes;

    public Pizzeria(){
        clientes = new Cliente[100];
        contadorClientes = 0;
    }

    public void registrarCliente(Cliente nuevoCliente) {
        clientes[contadorClientes++] = nuevoCliente;
        System.out.println("Registro exitoso de " + nuevoCliente.getNombre());
    }

    public int getContadorDeClientes() {
        return contadorClientes;
    }
}
