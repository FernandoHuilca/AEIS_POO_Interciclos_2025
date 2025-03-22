import RecursosHumanos.Empleado;
import RecursosHumanos.RecursosHumanos;

// Author Fernando Huilca
// 21 03 2025
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Bryan Magarisca", 456.50, "Gerente", "8horas");
        empleado1.imprimirInformacion();
        RecursosHumanos recursosHumanos = new RecursosHumanos();
        recursosHumanos.aumentarSalarioEmpleado(empleado1, 200);
        empleado1.imprimirInformacion();


        Empleado empleado2 = new Empleado("Sebas", 456.50, "Gerente", "8horas");

    }
}