//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Importar Scanner:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Banco
        Banco banco = Banco.getInstancia();
        //Instancia de Scanner:
        Scanner scanner = new Scanner(System.in);



        int opcion;
        do {
            System.out.println("__________ BIENVENIDO AL POLIBANCO __________");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contrasena = scanner.nextLine();
                    if(banco.comprobarUsuario(contrasena,nombre)){
                        Usuario usuario = banco.getUsuario(contrasena);
                        menuPrincipalUsuario(usuario);
                    }
                    else{
                        System.out.println("El usuario no existe");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("__________ Registrarse __________");
                    System.out.print("Ingrese el nombre: ");
                    String nombreRegistro = scanner.nextLine();
                    System.out.print("Ingrese la contraseña: ");
                    String contrasenaRegistro = scanner.nextLine();
                    System.out.print("Escoja el tipo de cuenta:  \n1 Cuenta de ahorros \n2 Cuenta de credito: ");
                    int aux = scanner.nextInt();
                    TipoDeCuenta tipoDeCuenta = null;
                    if (aux == 1) {
                        tipoDeCuenta = TipoDeCuenta.AHORROS;
                    }else if (aux == 2) {
                        tipoDeCuenta = TipoDeCuenta.CREDITO;
                    }
                    System.out.print("Ingrese el monto inicial: ");
                    double montoInicialRegistro = scanner.nextDouble();
                    Usuario usuario = new Usuario(nombreRegistro, contrasenaRegistro, montoInicialRegistro, tipoDeCuenta);
                    if(banco.registrarUsuario(usuario)){
                        System.out.println("El usuario se ha registrado con exito");
                    }else {
                        System.out.println("Error: Registro incorrecto.");
                    }
                    break;
                case 3:
                    System.out.println("__________ Salir Vuelva Pronto __________");
                    break;
            }

        }while (opcion != 3);



    }

    private static void menuPrincipalUsuario(Usuario usuario) {
        Banco banco = Banco.getInstancia();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("__________ BIENVENIDO AL POLIBANCO " + usuario.getNombre() + " _______________");
            System.out.println("1. Ver saldo de mi cuenta");
            System.out.println("2. Trasnferir dinero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(" Su saldo actual es: ");
                    System.out.println(banco.getSaldoCuenta(usuario.getCuenta()) + " Dolares $");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print(" Escriba el nombre de la cuenta destino: ");
                    String nombreCuentaDestino = scanner.nextLine();
                    //Aplicamos POlimorfismo con sobrecarga:
                    if(!banco.comprobarUsuario(nombreCuentaDestino)){
                        System.out.println("El nombre de la cuenta destino no existe");
                        break;
                    }
                    System.out.println("El usuario destino existe!! ");
                    System.out.print("Ingrese el monto del deposito: ");
                    double montoDeTransferencia = scanner.nextDouble();
                    if(banco.hacerTransferencia(usuario, banco.getUsuarioPorNombre(nombreCuentaDestino), montoDeTransferencia)){
                        System.out.println("Transferencia exitosa");
                    }else {
                        System.out.println("Error: Transferencia incorrecta");
                    };
            }
        }while(opcion != 3);
    }
}