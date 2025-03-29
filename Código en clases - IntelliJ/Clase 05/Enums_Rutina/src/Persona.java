public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarRutina(DiasDeLaSemana diaDeLaSemana) {

        switch (diaDeLaSemana){
            case LUNES :
                System.out.println("Es lunes y no hago nada");
                break;
            case MARTES:
                System.out.println("Es martes y doy clases");
                break;
            case VIERNES:
                System.out.println("1. Levantarse \n 2. Lavarme los dientes \n 3. Ir a la U " +
                        "\n 4. Dar clases de POO");
                break;
            default:
                System.out.println("No es un dia valido");
        }







    }

    public void mostrarRutina(String diaSemana){
        if (diaSemana == "Viernes"){
            System.out.println("1. Levantarse \n 2. Lavarme los dientes \n 3. Ir a la U " +
                    "\n 4. Dar clases de POO");
        }
    }

    public void mostrarEdad() {
        System.out.println("La edad de " + this.nombre + " es " +  edad);
    }
}
