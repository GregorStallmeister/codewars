package de.gregorstallmeister.codewars;

import de.gregorstallmeister.codewars.neededClasses.Cat;

import java.util.Comparator;

public class CatWeightComparatorSecond implements Comparator<Cat>
{
    @Override
    public int compare(Cat cat1, Cat cat2)
    {
        if (cat1.weight == cat2.weight)
            return 0;

        return cat1.weight - cat2.weight < 0 ? -1 : 1;
    }
}