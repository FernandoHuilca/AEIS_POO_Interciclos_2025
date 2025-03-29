public class Cliente {
    private String nombre;
    private int edad;
    private String dirreccion;
    private String numCelular;

    public Cliente(String nombre, int edad, String dirreccion, String numCelular) {
        this.nombre = nombre;
        this.edad = edad;
        this.dirreccion = dirreccion;
        this.numCelular = numCelular;
    }

    public String getNombre() {
        return nombre;
    }
}
