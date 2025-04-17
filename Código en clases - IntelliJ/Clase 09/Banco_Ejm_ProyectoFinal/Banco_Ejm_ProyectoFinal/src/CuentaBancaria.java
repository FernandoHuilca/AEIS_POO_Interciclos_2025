public class CuentaBancaria {
private double saldoTotal;
private TipoDeCuenta tipoDeCuenta;
public CuentaBancaria(double saldoTotal, TipoDeCuenta tipoDeCuenta) {
    this.saldoTotal = saldoTotal;
    this.tipoDeCuenta = tipoDeCuenta;

}

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void restarDinero(double montoDeTransferencia) {
        saldoTotal -= montoDeTransferencia;
    }

    public void sumarDinero(double montoDeTransferencia) {
        saldoTotal += montoDeTransferencia;
    }
}
