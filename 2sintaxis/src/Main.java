public class Main {


    public static void main(String[] args) {
        // llamar a una funcion
        String saludo = saludar("Sergio");
        System.out.println(saludo);

        /*
            Bloques
         */
        if(true) {
            int number = 5;
            System.out.println("Entro al if");
            System.out.println("Entro al if");
        }
        // Error
        // System.out.println("Numero: " + number);

        /*
            Identificadores
         */
        String identificador;
        String nombreUsuario;
        String nombre_usuaario;
        String _sys_var;
        String $php;
        String if1;
        // Nose se permite iniciar con numero
        // String 1numero;
        // Nose se permite porque return es una palabra reservada de java keyword
        // int return;

        /*
            Variables
         */
        int contador = 0;
        System.out.println(contador);
        int suma = 10 + contador;
        System.out.println(suma);
    }

    /**
     * Saludar
     *
     * @param nombre El nombre de una persona
     * @return Retorna el Saludo
     */
    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }
}
