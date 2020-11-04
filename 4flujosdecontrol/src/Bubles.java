public class Bubles {

    public static void main(String[] arg){

        // while
        System.out.println("while");
        int cont1 = 0;
        while (cont1 <= 3) {
            System.out.println(cont1);
            cont1++;
        }

        // do-while
        System.out.println("do-while");
        int cont2 = 3;
        do {
            System.out.println(cont2);
            cont2++;
        } while (cont2 <= 3);

        // For
        System.out.println("for");
        for (int i = 0; i < 3; i++ ) {
            System.out.println(i);
        }

        int cont3 = 0;
        for (cont3 = 0; cont3 < 3; cont3++) {
            System.out.println(cont3);
        }

        // for/in
        // arrays, listas, matrices
        System.out.println("for/in");
        String[] days = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        for (String day : days) {
            System.out.println(day);
        }
        
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
