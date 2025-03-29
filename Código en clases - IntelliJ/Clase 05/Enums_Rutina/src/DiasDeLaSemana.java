import java.util.SimpleTimeZone;

public enum DiasDeLaSemana {
    // CONSTANTE, SE ESCRIBEN TODO EN MAYÚCULAS
    LUNES("Primer dia de la semana"),
    MARTES("Segundo dia de la semana"),
    MIERCOLES("tercero dia de la semana"),
    JUEVES("Cuarto dia de la semana"),
    VIERNES("Quinto dia de la semana"),
    SABADO("Sexto dia de la semana"),
    DOMINGO("Septimo dia de la semana");

    private String descripcion;

    DiasDeLaSemana(String descripcion){
        this.descripcion = descripcion;
    }

    public void mostrarDescripcion(){
        System.out.println(descripcion);
    }
}
