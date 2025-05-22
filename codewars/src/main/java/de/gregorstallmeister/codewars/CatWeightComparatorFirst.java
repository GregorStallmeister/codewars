package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.Cat;

import java.util.Comparator;

public class CatWeightComparatorFirst implements Comparator<Cat>
{
    @Override
    public int compare(Cat cat1, Cat cat2)
    {
        return cat1.compareTo(cat2);
    }
}
