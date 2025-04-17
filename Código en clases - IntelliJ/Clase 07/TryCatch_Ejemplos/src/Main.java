import java.awt.datatransfer.Clipboard;

// Try Catch
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.dividir(15, 0);
        }catch (ArithmeticException e){
            System.out.println("Error:" + e.getMessage());
        }

        try {
            calculadora.validarLaEdad(12);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            calculadora.validarLaEdad(19);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}