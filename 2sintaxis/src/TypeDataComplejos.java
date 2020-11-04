public class TypeDataComplejos {

    // Tipo de enum
    enum Semaforo {
        VERDE, AMARILLO, ROJO
    }

    public static void main(String[] args) {
        // Tipo de dato cadena
        String nombre = "Sergio Antonio";
        String apellidos = new String("Ochoa Martinez");
        String isString; // null
        System.out.println(nombre.charAt(5));

        // Tipo de dato Enum
        System.out.println(Semaforo.AMARILLO);
        System.out.println(Estado.HABILITADO);
    }

    public static void mostrar() {

    }
}
