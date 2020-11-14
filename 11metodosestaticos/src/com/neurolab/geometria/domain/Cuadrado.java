package com.neurolab.geometria.domain;

public class Cuadrado extends Figura {

    private double base;
    private double altura;

    @Override
    public void calcularArea() {
        super.area = base * altura;
        System.out.println("Calcular Area desde com.neurolab.geometria.domain.Cuadrado");
    }

    @Override
    public void calcularPerimetro() {
        double potencia = Math.pow(2,2);
        System.out.println("Potencia: " + potencia);
        System.out.println("Calcular Perimero desde com.neurolab.geometria.domain.Cuadrado");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
