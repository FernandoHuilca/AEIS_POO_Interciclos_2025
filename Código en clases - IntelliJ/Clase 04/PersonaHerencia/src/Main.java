// Author Fernando Huilca
public class Main {
    public static void main(String[] args) {
        Persona camila = new Persona("Camila", 20);
        Persona claris = new Persona("Claris", 19);
        Profesor fernando = new Profesor("Fernando", 12);
        camila.saludar();
        claris.saludar();

        Estudiante janine = new Estudiante("Janine", 19, "matutino", fernando );
        janine.pedirTutoría();


        camila.saludar();
        janine.saludar();
        janine.pedirTutoría();


    }
}