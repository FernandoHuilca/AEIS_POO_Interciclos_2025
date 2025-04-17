// Pizzería ejemplo general.
public class Main {
    public static void main(String[] args) {
        Cliente fernando = new Cliente("Fernando", 21, "Macondo-Ecuador", "0912345561");
        Pizzeria pizzeria = new Pizzeria();

        pizzeria.registrarCliente(fernando);
        pizzeria.registrarCliente(new Cliente("Camila", 19, "Guaya kill", "091234567"));
        System.out.println("La pizzeria tiene : " + pizzeria.getContadorDeClientes() + " clientes");


        //PIZZAS:_________________________________________________________________________
        PizzaPepperoni pizza = new PizzaPepperoni(TamanioPizza.PERSONAL);
        //Polimorfismo con sobrecarga:
        String nuevosIngredientes = "Masa, Salsa de tomate, Queso mozzarella, pepperoni";
        PizzaPepperoni pizza2 = new PizzaPepperoni(TamanioPizza.PERSONAL, nuevosIngredientes);
        Pizza pizzaHawaiana = new PizzaHawaiana(TamanioPizza.FAMILIAR);
        Pizza pizza1 = new PizzaNapolitana(TamanioPizza.MEDIANA);

        // MÉTODO DE VENDER PIZZAS: _________________________________________________________________________
        pizzeria.venderPizza(fernando, pizzaHawaiana, DiaDeLaSemana.LUNES);
        pizzeria.venderPizza(fernando, pizzaHawaiana, DiaDeLaSemana.MIERCOLES);
        pizzeria.venderPizza(fernando, pizzaHawaiana, DiaDeLaSemana.SABADO);
        pizzeria.venderPizza(fernando, pizza1, DiaDeLaSemana.SABADO);

    }
}