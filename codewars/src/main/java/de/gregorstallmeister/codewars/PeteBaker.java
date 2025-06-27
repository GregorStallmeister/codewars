package de.gregorstallmeister.codewars;

import java.util.Map;

public class PeteBaker {
    public static int cakesFirst(Map<String, Integer> recipe, Map<String, Integer> available) {
        int res = Integer.MAX_VALUE;

        for (String ingredient : recipe.keySet()) {
            if (!available.containsKey(ingredient)) {
                res = 0;
                break;
            }

            int resActual = available.get(ingredient) / recipe.get(ingredient);
            if (resActual < res)
                res = resActual;
        }

        return res;
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int res = Integer.MAX_VALUE;

        for (String ingredient : recipe.keySet()) {
            if (!available.containsKey(ingredient))
                return 0;

            res = Integer.min(res, available.get(ingredient) / recipe.get(ingredient));
        }

        return res;
    }
}
