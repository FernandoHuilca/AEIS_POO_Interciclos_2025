public class Calculadora {
    public int sumar(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }
    //SobreCarga (overload) variando la cantidad de parámetros
    public int sumar(int sumando1, int sumando2, int sumando3){
        return sumando1 + sumando2 + sumando3;
    }

    //SobreCarga variando el tipo de parámetro
    public double sumar(double sumando1, double sumando2) {
        return sumando1 + sumando2;
    }
}
