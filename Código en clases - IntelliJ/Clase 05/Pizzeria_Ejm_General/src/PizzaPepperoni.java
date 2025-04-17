public class PizzaPepperoni extends Pizza{

    //Constructor
    public PizzaPepperoni(TamanioPizza tamanioPizza) {
        super(tamanioPizza, 12.50, "Masa, Salsa de tomate, Queso mozzarella, pepperoni, oregano");
    }

    //Sobrecarga Override
    public PizzaPepperoni(TamanioPizza tamanioPizza, String ingredientes) {
        super(tamanioPizza, 12.50, ingredientes);
    }
}
