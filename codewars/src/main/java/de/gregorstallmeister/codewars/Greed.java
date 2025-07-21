package de.gregorstallmeister.codewars;

import java.util.HashMap;
import java.util.Map;

public class Greed {
    // below top 50
    public static int greedyFirst(int[] dice){
        Map<Integer, Integer> occ = new HashMap<>();

        for (int i = 1; i < 7; i++) {
            occ.put(i, 0);
        }

        for (int val : dice) {
            occ.put(val, occ.get(val) + 1);
        }

        int score = 0;

        switch (occ.get(1)) {
            case 5: score += 1200; break;
            case 4: score += 1100; break;
            case 3: score += 1000; break;
            case 2: score += 200; break;
            case 1: score += 100; break;
            default: break;
        }

        if (occ.get(2) >= 3)
            score += 200;

        if (occ.get(3) >= 3)
            score += 300;

        if (occ.get(4) >= 3)
            score += 400;

        switch (occ.get(5)) {
            case 5: score += 600; break;
            case 4: score += 550; break;
            case 3: score += 500; break;
            case 2: score += 100; break;
            case 1: score += 50; break;
            default: break;
        }

        if (occ.get(6) >= 3)
            score += 600;

        return score;
    }

    public static int greedy(int[] dice){
        int[] occ = new int[7];

        for (int die : dice)
            occ[die]++;

        return occ[1]/3*1000 + occ[1]%3*100 + occ[2]/3*200 + occ[3]/3*300 + occ[4]/3*400 + occ[5]/3*500 + occ[5]%3*50 + occ[6]/3*600;
    }
}
