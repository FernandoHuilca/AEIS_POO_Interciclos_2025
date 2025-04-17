import java.util.HashMap;
import java.util.Objects;

public class Banco {
    HashMap<String,Usuario> listaHashUsuarios = new HashMap<>();

    // 1. Instancia única (privada y estática)
    private static Banco instancia = new Banco();

    // 2. Constructor privado (evita que otros creen instancias)
    private Banco() {
        return;
    }
    // 3. Metodo público para obtener la instancia
    public static Banco getInstancia() {
        return instancia;
    }



    public boolean comprobarUsuario(String contrasena, String nombre) {
        if(listaHashUsuarios.containsKey(contrasena) && Objects.equals(listaHashUsuarios.get(contrasena).getNombre(), nombre)){
            return true;
        }
        else {
            return false;
        }
    }

    public Usuario getUsuario(String contrasena) {
        return listaHashUsuarios.get(contrasena);
    }

    public boolean registrarUsuario(Usuario nuevoUsuario) {
        listaHashUsuarios.put(nuevoUsuario.getContrasenia(), nuevoUsuario);
        if (listaHashUsuarios.containsKey(nuevoUsuario.getContrasenia())) {
            return true;
        }
        return false;
    }


    public double getSaldoCuenta(CuentaBancaria cuenta ) {
        return cuenta.getSaldoTotal();
    }
    public boolean comprobarUsuario(String nombreCuentaDestino) {
        for (Usuario usuario : listaHashUsuarios.values()) {
            if (usuario.getNombre().equals(nombreCuentaDestino)) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuarioPorNombre(String nombreCuenta) {
        for (Usuario usuario : listaHashUsuarios.values()) {
            if (usuario.getNombre().equals(nombreCuenta)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean hacerTransferencia(Usuario usuarioOrigen, Usuario usuarioDestino, double montoDeTransferencia) {
        usuarioOrigen.getCuenta().restarDinero(montoDeTransferencia);
        usuarioDestino.getCuenta().sumarDinero(montoDeTransferencia);
        return true;
    }
}
