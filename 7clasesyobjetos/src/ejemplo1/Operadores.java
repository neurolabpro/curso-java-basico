package ejemplo1;

public class Operadores {

    // Atributos
    public double number1;
    public double number2;
    public int number3;
    public double resultResta;

    // Contructor por Defecto
    public Operadores() {
    }

    // Contructores sobrecargados
    public Operadores(double number1) {
        this.number1 = number1;
    }

    public Operadores(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }

    public Operadores(double number1, double number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    // Metodos
    public int suma(int param1, int param2) {
        return param1 + param2;
    }

    public void resta() {
        resultResta = number1 - number2;
    }

    // int... params => int[] params = new int[10]; => List<Integer> params = new ArrayList<>();
    public double multiplicacion(int... params) {
        int mul = 1;
        for (int num: params) {
            mul *= num; // mul = mul * num;
        }
        return mul;
    }

    public void division(int dividendo, int... divisor) {

    }
}
