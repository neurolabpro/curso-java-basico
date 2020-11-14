package com.neurolab.geometria.domain;

public abstract class Figura {

    protected double area;
    protected double perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

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
