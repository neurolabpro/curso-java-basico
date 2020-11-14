package com.neurolab.geometria.utils;

public class MatematicaUtils {
    // Constante
    public static final double PI = 3.1416;

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
