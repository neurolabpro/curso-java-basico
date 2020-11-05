package ejemplo2;

public class Main {
    public static void main(String[] arg) {
        Cuenta miCuenta; // Su valor por defecto es null
        Cuenta suCuenta = new Cuenta();
        suCuenta.setSaldo(1000);
        suCuenta.setMoneda(Moneda.BS);
        suCuenta.ingreso(10000);
        suCuenta.gasto(600);
        System.out.println("Saldo suCuenta: " + suCuenta.getSaldo());

        Cuenta tuCuenta = new Cuenta(1400, Moneda.EUR);
        tuCuenta.ingreso(1000);
        tuCuenta.ingreso(100);
        tuCuenta.gasto(500);

        System.out.println("Saldo tuCuenta: " + tuCuenta.getSaldo());

        // Utiliar el operador .
        String s1 = "Sergio";
        char c = s1.substring(0,3).toUpperCase().charAt(2);

        // Equivalente largo
        String s2 = "Ochoa";
        String s3 = s2.substring(0,3); // Ocho
        String s4 = s3.toUpperCase(); // OCHO
        char h = s4.charAt(2); // H

    }
}
