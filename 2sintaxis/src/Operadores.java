public class Operadores {

    public static void main(String arg[]) {
        // Operadores aritmeticos
        int a = 5;
        int b = 2;
        int c = 2;
        int d = 10;
        int suma = a + b;
        int resta = a - b;
        int mul = a * b;
        int div = a/b;
        int residuo = a%b;

        // Operadores logicos
        if ( a > b) { }
        if(a <= b) {}
        if(a == b) {}
        if(a != b) {}

        if ((a > b && a == c) || a < d) {

        }

        // Operadores de Asignacion
        int e = a; // a = 5, e = 5
        a += b; // a = a + b;
        a -= b; // a = a - b;
        a *= c; // a = a * c;
        a /= e; // a = a / e;
        a %= e; // a = a % e;

        // Operadores unarios
        ++a; // pre
        a++; // post

        // Operador ternario
        String resultado = a >= c ? "a es mayor": "a es menor";
    }
}
