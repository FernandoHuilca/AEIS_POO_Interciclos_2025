public class Estudiante extends Persona {
    //Atributos
    private String horario;
    private Profesor tutor;


    //Constructor
    public Estudiante(String nombre, int edad, String horario, Profesor tutor){
        super(nombre,edad);
        this.horario = horario;
        this.tutor = tutor;
    }

    //Métodos
    public void pedirTutoría(){
        System.out.println("El estudiante " + this.getNombre() + " Está pidiendo una tutoría a " + tutor.getNombre());
    }
}
