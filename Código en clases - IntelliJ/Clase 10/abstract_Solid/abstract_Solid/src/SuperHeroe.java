public abstract class SuperHeroe {

    //Atributos Generales
    private String nombreReal;

    //Constructor
    public SuperHeroe(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    //Metodo Concreto
    public void revelarIdentidad(){
        System.out.println("Mi identidad sescreta es: " + nombreReal);
    }

    //Metodo Abstracto
    public abstract void ocuparPoderEspecial();
}
