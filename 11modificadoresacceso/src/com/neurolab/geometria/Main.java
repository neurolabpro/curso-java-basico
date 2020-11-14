package com.neurolab.geometria;

import com.neurolab.geometria.domain.Circulo;
import com.neurolab.geometria.domain.Cuadrado;
import com.neurolab.geometria.domain.Matematica;
import com.neurolab.geometria.domain.Triangulo;

public class Main {

    public static void main(String[] args) {
        //com.neurolab.geometria.domain.Figura figura = new com.neurolab.geometria.domain.Figura();

        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();

        Matematica matematica = new Matematica();
        matematica.calcularArea(triangulo);
        matematica.calcularArea(cuadrado);
        System.out.println("Area cuadrado: " + cuadrado.getArea());
        matematica.calcularArea(circulo);

        matematica.calcularPerimetro(triangulo);
        matematica.calcularPerimetro(cuadrado);
        matematica.calcularPerimetro(circulo);
    }
}
