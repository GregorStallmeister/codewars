package de.gregorstallmeister.codewars.neededClasses;

public class Triangle {
    public final int height;
    public final int base;
    private double area;
    public void setArea(double a) {
        area = a;
    }
    public double getArea() {
        return area;
    }

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }
}
