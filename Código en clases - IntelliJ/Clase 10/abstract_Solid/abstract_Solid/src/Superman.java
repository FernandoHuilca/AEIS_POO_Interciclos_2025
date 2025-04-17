public class Superman extends SuperHeroe implements Volar{
    public Superman(String nombreReal) {
        super(nombreReal);
    }

    @Override
    public void ocuparPoderEspecial() {
        System.out.println("Ojos laser");
    }

    @Override
    public void volar() {
        System.out.println("Ahora estoy volando, por mis poderes Cryptoneanos");
    }

}
