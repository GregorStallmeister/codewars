package de.gregorstallmeister.codewars;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        return 2 * (sideLength / 2.0) * (1 / (Math.tan(Math.PI / sides)));
    }
}