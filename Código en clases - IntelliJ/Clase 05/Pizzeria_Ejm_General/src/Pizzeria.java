public class Pizzeria {
    private Cliente[] clientes;
    private int contadorClientes;
    private double descuentoDelMiercoles = 0.50;
    private double descuentoDelSabado = 0.25;
    private double descuentoInicial = 0.0;

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

    public void venderPizza(Cliente cliente, Pizza pizzaAVender, DiaDeLaSemana diaActual) {
        double precioNetoPizza = pizzaAVender.getPrecio();
        double valorDeDescuento = descuentoInicial;
        if (diaActual == DiaDeLaSemana.MIERCOLES){
            valorDeDescuento = precioNetoPizza * descuentoDelMiercoles;
        }
        if (diaActual == DiaDeLaSemana.SABADO &&  pizzaAVender instanceof PizzaNapolitana){
            valorDeDescuento = precioNetoPizza * descuentoDelSabado;
        }
        double precioFinal = precioNetoPizza - valorDeDescuento;
        System.out.println(" _______ FACTURA ________ \n Nombre Cliente = " + cliente.getNombre()
                + "\nprecioNeto = " + precioNetoPizza
                + "\nDescuento aplicado = " + valorDeDescuento + "\n Precio final = " + precioFinal);
    }
}
