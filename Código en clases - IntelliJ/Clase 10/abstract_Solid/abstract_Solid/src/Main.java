//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Iroman iroman = new Iroman("Tony Stark");
    iroman.revelarIdentidad();
    iroman.ocuparPoderEspecial();
    Superman superman = new Superman("Clark Kent");
    superman.revelarIdentidad();
    superman.ocuparPoderEspecial();
    iroman.volar();
    superman.volar();

    Avion avion = new Avion();
    avion.volar();

    }
}