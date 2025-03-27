public class Persona {
    //Atributos
    private String nombre;
    private int edad;


    //Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Métodos
    public void saludar(){
        System.out.println("Ahora la persona " + nombre + " está saludando");
    }
    public String  getNombre(){
        return nombre;
    }

}
