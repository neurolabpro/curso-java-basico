package com.neurolab.geometria;

import com.neurolab.geometria.utils.MatematicaUtils;
import com.neurolab.geometria.utils.StringUtils;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        out.println("Hola mundo");

        // No se permite porque solo tiene metodos estaticos
        // y por eso se creo el contructor privado
        // MatematicaUtils matematicaUtils = new MatematicaUtils();
        double suma = MatematicaUtils.suma(1,2,3,4,5);
        System.out.println("Suma: " + suma);


        String[] nombres = StringUtils.dividir1();
        System.out.println("Cadena estatico: " + StringUtils.cadena1);
    }
}
