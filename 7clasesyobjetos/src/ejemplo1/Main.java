package ejemplo1;

public class Main {

    public static void main(String[] args) {
        Operadores op1 = new Operadores();
        double multiplicacion = op1.multiplicacion(1,2,3,4,5);
        System.out.println("Multiplicación: " + multiplicacion);

        op1.number1 = 5;
        op1.number2 = 1;
        op1.resta();
        System.out.println("Resta: " + op1.resultResta);

        int suma = op1.suma(4,10);
        System.out.println("Suma: " + suma);

        System.out.println("-------------Operador 2----------------");
        Operadores op2 = new Operadores(4,6);
        op2.resta();
        System.out.println("Resta: " + op2.resultResta);

        Operadores op3 = new Operadores(3,4,5);

    }
}
