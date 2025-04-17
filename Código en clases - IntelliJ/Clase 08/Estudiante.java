public class Estudiante {
    private String nombre;
    private int edad;
    private String semestre;

    public Estudiante(String nombre, int edad, String semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante \n Nombre: " + nombre + "\n Edad: " + edad + "\n Semestre: " + semestre;
    }
}
