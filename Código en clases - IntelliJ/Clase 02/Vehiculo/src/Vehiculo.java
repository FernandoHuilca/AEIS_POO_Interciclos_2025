public class Vehiculo {
    // Atributos "Lo que tiene"
    private String marca;
    private int numeroDeLlantas;
    private String propietario;
    private double velocidad;


    // Métodos "Los comportamientos"

    public void acelerar(){
        velocidad = velocidad + 10;
        System.out.println("El vehiculo está acelerando " + velocidad);
    }


    // Métodos Getters y Setters
    public void setPropietario(String nombrePropietario){
        this.propietario = nombrePropietario;
    }

    public String getPropietario(){
        return propietario;
    }
    public double getVelocidad(){
        return velocidad;
    }




}
