public class Main {

    public static void main(String[] args ){
        Cirujano cirujano = new Cirujano();
        cirujano.setTrabajaEnHospital(false);
        cirujano.tratarPaciente();
        cirujano.hacerIncision();
        // Metodos de la clase object
        System.out.println(cirujano.toString());
        System.out.println(cirujano.getClass());
    }
}
