package de.gregorstallmeister.codewars;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int maxSum = 0;

        if (arr.length == 0)
            return maxSum;

        for (int i = 0; i < arr.length -1; i++) {
            int sumCurrent = arr[i];
            if (sumCurrent > maxSum)
                maxSum = sumCurrent;

            for (int j = i + 1; j < arr.length; j++) {
                sumCurrent += arr[j];
                if (sumCurrent > maxSum)
                    maxSum = sumCurrent;
            }
        }

        return maxSum;
    }
}
