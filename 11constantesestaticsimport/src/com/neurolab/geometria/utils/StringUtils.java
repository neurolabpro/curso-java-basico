package com.neurolab.geometria.utils;

public class StringUtils {

    private String cadena;
    public static String cadena1;

    static {
        cadena1 = "Sergio,Rocio,Daniel,Johel";
    }

    public StringUtils(){
        cadena = "Sergio,Rocio,Daniel,Johel";
    }

    public String[] dividir() {
        String[] nombres = split1(",");
        return nombres;
    }

    public static String[] dividir1() {
        // No funciona por que no es un metodo statico
        // String[] nombres = split(",");
        String[] nombres = split1(",");
        return nombres;
    }

    public String[] split(String c) {
        return cadena.split(c);
    }

    public static String[] split1(String c) {
        return cadena1.split(c);
    }
}
