package Calculadora;

public class Calculadora {
    private int ultimoResultado;

    public Calculadora() {
        ultimoResultado = 0;
    }

    public int sumarDosNumerosEnteros(int sumando1, int sumando2) {
        ultimoResultado = sumando1 + sumando2;
        return ultimoResultado;
    }

    public int dividirDosEnteros(int dividendo, int divisor) {
    if (divisor == 0){
        return 0;
    }
        return dividendo/divisor;
    }

    public int restarDosEnteros(int a, int b) {
    return a-b;
    }
}
