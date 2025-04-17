public class Pentagono extends FormaGeometrica {
    private double tamanioLado;

    public Pentagono(double tamanioLado) {
        this.tamanioLado = tamanioLado;
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del pentagono es: " + (5* tamanioLado));
    }
}
