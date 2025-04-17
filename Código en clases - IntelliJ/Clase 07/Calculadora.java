public class Calculadora {
    public void dividir(double dividendo, int divisor) throws ArithmeticException {
        double resultado = 0;
        if (divisor == 0){
            throw new ArithmeticException("Division por cero");
        }
            resultado =  dividendo/divisor;
            System.out.println("Error: No dividas para cero");
    }



   //USO DE TRY CATCH PERSONALIZADO
    public void validarLaEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Edad menor a 18");
        }
            System.out.println("Bienvenido");
    }


}


