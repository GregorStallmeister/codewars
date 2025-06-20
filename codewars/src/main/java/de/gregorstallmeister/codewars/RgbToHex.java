package de.gregorstallmeister.codewars;

public class RgbToHex {
    public static String rgbFirst(int r, int g, int b) {
        r = toRange(r);
        g = toRange(g);
        b = toRange(b);

        String result = (Integer.toHexString(r).length() == 2 ? Integer.toHexString(r) : "0" + Integer.toHexString(r)) +
                (Integer.toHexString(g).length() == 2 ? Integer.toHexString(g) : "0" + Integer.toHexString(g)) +
                (Integer.toHexString(b).length() == 2 ? Integer.toHexString(b) : "0" + Integer.toHexString(b));

        return result.toUpperCase();
    }

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", toRange(r), toRange(g), toRange(b));
    }

    static int toRange(int p) {
        if (p < 0) return 0;
        return Math.min(p, 255);
    }
}
