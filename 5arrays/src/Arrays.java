public class Arrays {

    public static void main(String[] arg) {
        int[] numeros = new int[5];
        numeros[0] = 45;
        numeros[1] = 50;
        numeros[3] = 35;
        numeros[4] = 65;

        for (int numero : numeros) {
            System.out.println(numero);
            if (numero == 45) {
                System.out.println("Numero 45");
            }
        }

        double decimales[] = new double[5];
        decimales[1] = 4.5;
        decimales[3] = 4;

        String[] dias = new String[7];
        dias[0] = "Lunes";
        dias[1] = "Martes";

        String[] days = {"lunes", "Martes", "Miercoles", "jueves", "Viernes", "Sabado", "Domingo"};
        days[0] = "Lunes";
        days[3] = "Jueves";

        System.out.println("Dia de la semana: " + days[1]);
    }
}
