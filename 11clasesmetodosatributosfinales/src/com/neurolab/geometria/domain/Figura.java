package com.neurolab.geometria.domain;

public abstract class Figura {

    protected final double pi = 3.14;
    protected double area;
    protected double perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public final void imprimirArea() {
        System.out.println("Area: " + area);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
