import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add(2, "Viernes");
        days.add("sabado");

        for (String day: days) {
            System.out.println(day);
        }

        System.out.println("Segunda impresion");
        days.set(3,"Sabado");
        days.add(2,"Miercoles");
        days.add(3, "Jueves");

        for (int i = 0; i < days.size(); i++) {
            String day = days.get(i);
            System.out.println(day);
        }
    }
}
