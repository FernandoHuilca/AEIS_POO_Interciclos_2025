public class OperacionMatematica {
    private int operando1;
    private int operando2;

    // Concepto de "abstracto"
    public void realizarOperacion(int operando1, int operando2){
        System.out.println("Operación genérica con " + operando1 + " y " + operando2);
    }
}
