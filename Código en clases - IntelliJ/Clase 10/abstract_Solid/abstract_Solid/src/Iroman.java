public class Iroman extends SuperHeroe implements Volar {


    public Iroman(String nombreReal) {
        super(nombreReal);
    }

    @Override
    public void ocuparPoderEspecial() {
        System.out.println("Soy muy inteligente y tengo una armadura");
    }

    @Override
    public void volar() {
        System.out.println("Ahora estoy volando por mi supertraje  ");
    }
}
