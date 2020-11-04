public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean haceFrio = false;
        boolean llueve = true;
        // AND && Logico
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false
        if(haceFrio && llueve) {
            System.out.println("");
        }

        // OR || Logico
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
        if(haceFrio || llueve) {
            System.out.println("Si hace frio o llueve");
        }
    }
}
