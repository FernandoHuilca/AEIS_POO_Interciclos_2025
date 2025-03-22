package RecursosHumanos;

public class Empleado {
    //Atributos
    private String nombre;
    protected double salario;
    private String cargo;
    private String horario;

    // CONSTRUCTOR
    public Empleado(String nombre, double salario, String cargo, String horario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.horario = horario;
        this.salario = salario;
    }

    //Métodos
    public void imprimirInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Horario: " + horario);

    }



}
