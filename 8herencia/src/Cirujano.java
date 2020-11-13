public class Cirujano extends Medico {

    public Cirujano() {
    }

    public Cirujano(boolean trabajaEnHospital) {
        super(trabajaEnHospital);
        // super.trabajaEnHospital = trabajaEnHospital;
    }

    @Override
    public void tratarPaciente() {
        System.out.println("Realizar un consulta");
    }

    public void hacerIncision() {
        if(super.trabajaEnHospital) {
            System.out.println("Realizar la incision");
        } else {
            System.out.println("No realiza operaciones clinica");
        }
    }
}
