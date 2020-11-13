public class Main {

    public static void main(String[] arg) {
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(1,2);

        System.out.println("Punto 1: " + punto1);
        System.out.println("Punto 2: " + punto2);

        if(punto1.equals(punto2)) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("No son Iguales");
        }

    }
}
