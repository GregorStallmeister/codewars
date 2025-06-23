package de.gregorstallmeister.codewars;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr;

        for (int i = 0; i < arr.length - 1; i++) {
            if (isOpposite(arr[i], arr[i + 1])) {
                String[] arrNew = new  String[arr.length - 2];
                for (int j = 0; j < i; j++) {
                    arrNew[j] = arr[j];
                }
                for (int k = i; k < arr.length - 2; k++) {
                    arrNew[k] = arr[k + 2];
                }

                return dirReduc(arrNew);
            }
        }

        return arr;
    }

    private static boolean isOpposite(String acutal, String next) {
        if (acutal.equals(("NORTH")) && next.equals("SOUTH"))
            return true;
        if (acutal.equals(("SOUTH")) && next.equals("NORTH"))
            return true;
        if (acutal.equals(("EAST")) && next.equals("WEST"))
            return true;

        return acutal.equals(("WEST")) && next.equals("EAST");
    }
}
