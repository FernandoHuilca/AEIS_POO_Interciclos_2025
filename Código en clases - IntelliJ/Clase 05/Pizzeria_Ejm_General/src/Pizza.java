public class Pizza {
    private TamanioPizza tamanioPizza;
    private double precio;
    private String ingredientes;

    public Pizza(TamanioPizza tamanioPizza,double precio, String ingredientes){
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.tamanioPizza = tamanioPizza;
    }

    public double getPrecio() {
        return precio;
    }
}
