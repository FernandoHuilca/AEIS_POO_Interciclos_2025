// Polimorfismo - Sobrecarga y SobreEscritura
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.sumar(3, 8);
        System.out.println(" El resultado de la suma es = " + resultado);

        System.out.println(" El resultado de la suma es = " + calculadora.sumar(3, 8));

        System.out.println(" El resultado de la suma es = " + calculadora.sumar(3,3,11));

        System.out.println(" El resultado de la suma es = " + calculadora.sumar(22.7, 7.2));


        OperacionMatematica operacionMatematica = new OperacionMatematica();
        operacionMatematica.realizarOperacion(3, 5);
        Multiplicar multiplicar = new Multiplicar();
        multiplicar.realizarOperacion(4, 4);
        Division division = new Division();
        division.realizarOperacion(16, 4);


    }
}