package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.Cat;

import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2)
    {
        return Double.compare(cat1.weight, cat2.weight);
    }
}
