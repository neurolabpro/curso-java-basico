public class Main {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();

        Matematica matematica = new Matematica();
        matematica.calcularArea(triangulo);
        matematica.calcularArea(cuadrado);
        matematica.calcularArea(circulo);

        matematica.calcularPerimetro(triangulo);
        matematica.calcularPerimetro(cuadrado);
        matematica.calcularPerimetro(circulo);
    }
}
