package com.neurolab.geometria.utils;

public class MatematicaUtils {

    private MatematicaUtils() {}

    public static double suma(double... numbers) {
        double suma = 0;
        for (double number: numbers) {
            suma += number;
        }
        return suma;
    }

    public static double multiplicacion(double... numbers) {
        double mul = 1;
        for (double number: numbers) {
            mul *= number;
        }
        return mul;
    }

}
