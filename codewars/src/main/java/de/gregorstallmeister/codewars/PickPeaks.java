package de.gregorstallmeister.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {

    // Rank 94
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map<String,List<Integer>> res = new HashMap<>();
        List<Integer> peakList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();
        Integer currPeak = null;
        Integer currPos = null;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currPeak = arr[i];
                currPos = i;
            }
            else if (arr[i] < arr[i - 1] && currPeak != null) {
                peakList.add(currPeak);
                posList.add(currPos);

                currPeak = null;
                currPos = null;
            }
        }

        res.put("peaks", peakList);
        res.put("pos", posList);

        return res;
    }
}
