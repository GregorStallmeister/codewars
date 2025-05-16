package de.gregorstallmeister.codewars;

import java.util.Arrays;

public class PythagoreanTriple {

    public int pythagoreanTripleFirst(int[] triple) {

        if ((triple[0] * triple[0]) + (triple[1] * triple[1]) == triple[2] * triple[2])
            return 1;

        if ((triple[0] * triple[0]) + (triple[2] * triple[2]) == triple[1] * triple[1])
            return 1;

        if ((triple[1] * triple[1]) + (triple[2] * triple[2]) == triple[0] * triple[0])
            return 1;

        return 0;
    }

    public int pythagoreanTriple(int[] triple) {

        Arrays.sort(triple);

        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }
}
