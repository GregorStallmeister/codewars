package de.gregorstallmeister.codewars;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public int solutionFirst(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                continue;
            }

            if (i % 3 == 0) {
                sum += i;
            }

            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
