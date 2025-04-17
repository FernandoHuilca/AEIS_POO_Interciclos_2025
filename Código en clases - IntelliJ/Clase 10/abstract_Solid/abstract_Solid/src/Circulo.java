public class Circulo extends FormaGeometrica {
    private  double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: " + (2* radio * 3.14));
    }
}
