package de.gregorstallmeister.codewars.neededClasses;

public class Cat implements Comparable<Cat> {
    public final String name;
    public final double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat c) {
        if (this.equals(c))
            return 0;

        return this.weight - c.weight < 0 ? -1 : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            return this.weight == ((Cat) o).weight;
        }

        return false;
    }
}
