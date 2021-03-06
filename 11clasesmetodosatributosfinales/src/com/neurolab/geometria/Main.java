package com.neurolab.geometria;

import com.neurolab.geometria.domain.*;
import com.neurolab.geometria.utils.MatematicaUtils;
import com.neurolab.geometria.utils.StringUtils;

public class Main {

    public static void main(String[] args) {
        //com.neurolab.geometria.domain.Figura figura = new com.neurolab.geometria.domain.Figura();

        Triangulo triangulo = new TrianguloEquilatero();
        Rectangulo rectangulo = new Rectangulo();
        Circulo circulo = new Circulo();

        Matematica matematica = new Matematica();
        matematica.calcularArea(triangulo);
        matematica.calcularArea(rectangulo);
        System.out.println("Area cuadrado: " + rectangulo.getArea());
        matematica.calcularArea(circulo);

        matematica.calcularPerimetro(triangulo);
        matematica.calcularPerimetro(rectangulo);
        matematica.calcularPerimetro(circulo);

        // No se permite porque solo tiene metodos estaticos
        // y por eso se creo el contructor privado
        // MatematicaUtils matematicaUtils = new MatematicaUtils();
        double suma = MatematicaUtils.suma(1,2,3,4,5);
        System.out.println("Suma: " + suma);


        String[] nombres = StringUtils.dividir1();
        System.out.println("Cadena estatico: " + StringUtils.cadena1);
    }
}
