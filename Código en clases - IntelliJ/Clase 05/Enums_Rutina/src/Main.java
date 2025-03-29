// Author: Fernando Huilca

public class Main {
    public static void main(String[] args) {

        Persona fernando = new Persona("Fernando", 21);
        fernando.mostrarRutina(DiasDeLaSemana.MARTES);
        Persona mayerli = new Persona("Mayerli");
        fernando.mostrarEdad();
        mayerli.mostrarEdad();

        fernando.mostrarRutina("Viernes");
        DiasDeLaSemana.VIERNES.mostrarDescripcion();
    }
}