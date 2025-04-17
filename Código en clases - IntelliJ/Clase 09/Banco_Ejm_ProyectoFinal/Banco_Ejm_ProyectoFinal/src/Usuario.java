public class Usuario {
    String nombre;
    String contrasena;
    CuentaBancaria cuentaBancaria;

    public Usuario(String nombre, String contrasena, double saldoInicialRegistro, TipoDeCuenta tipoDeCuenta) {
    this.nombre = nombre;
    this.contrasena = contrasena;
    this.cuentaBancaria = new CuentaBancaria(saldoInicialRegistro, tipoDeCuenta);
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasena;
    }

    public CuentaBancaria getCuenta() {
        return cuentaBancaria;
    }
}


