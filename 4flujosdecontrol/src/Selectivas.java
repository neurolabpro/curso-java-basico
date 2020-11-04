public class Selectivas {

    public static void main(String[] args) {
        // Sentecia if if-else if-else-if

        // if
        int number = 5;
        if (number < 10 && number >= 5) {
            System.out.println( number + " es mayor");
        }

        // if-else
        String day = "Sabado";
        if(day.equals("Sabado") || day.equals("Domingo") ) {
            System.out.println("El dia es un fin de semana. Un dia libre");
        } else {
            System.out.println("El un dia laboral");
        }

        // if-else-if
        if(day.equals("Lunes")) {
            System.out.println("Un dia laboral pero muy cansador");
        } else if(day.equals("Martes")) {
            System.out.println("Un dia laboral pero mas tranquilo");
        } else if(day.equals("Sabado")) {
            System.out.println("Es un dia libre");
        } else {
            System.out.println("No es un dia de la semana");
        }

        switch (day) {
            case "Lunes":
                System.out.println("Un dia laboral pero muy cansador");
                break;
            case "Martes":
                System.out.println("Un dia laboral pero mas tranquilo");
                break;
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Un dia laboral");
                break;
            case "Sabado":
                System.out.println("mensajes");
            case "Domingo":
                System.out.println("Es un dia libre");
                break;
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
