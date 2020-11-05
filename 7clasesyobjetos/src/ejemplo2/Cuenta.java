package ejemplo2;

public class Cuenta {

    // Atributos
    private double saldo;
    private Moneda moneda;

    // Contructor por defecto
    public Cuenta() {
    }

    // Contructor sobrecargado
    public Cuenta(double saldo, Moneda moneda) {
        this.saldo = saldo;
        this.moneda = moneda;
    }

    // Metodos
    public void gasto(double param) {
        // saldo = saldo - param;
        saldo -= param;
    }

    public void ingreso(double param) {
        saldo = saldo + param;
    }

    // Metodos mutadores y accesores,  setter && getter

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
