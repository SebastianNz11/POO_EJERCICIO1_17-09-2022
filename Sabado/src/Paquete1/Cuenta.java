package Paquete1;

public class Cuenta {

    double saldo;

    public void agregarSaldo(double suma) {
        saldo += suma;
    }

    public void sacarSaldo(double resta) {
        saldo -= resta;
    }

    public void saldoActual() {
        System.out.println("Su saldo actual es:  " + saldo);
    }

}
