package de.gregorstallmeister.codewars;

public class EightiesKids3 {

    public static String[] getSocksFirst(String name, String[] socks) {

        if (name.equals("Punky")) {
            for (int i = 1; i < socks.length; i++) {
                if (!socks[0].equals(socks[i])) {
                    return new String[]{socks[0], socks[i]};
                }
            }
        }

        if (name.equals("Henry")) {
            for (int i = 0; i < socks.length - 1; i++) {
                for (int j = i + 1; j < socks.length; j++) {
                    if (socks[i].equals(socks[j])) {
                        return new String[]{socks[i], socks[j]};
                    }
                }
            }
        }

        return new String[0];
    }

    public static String[] getSocks(String name, String[] socks) {

        for (int i = 0; i < socks.length - 1; i++) {
            for (int j = i + 1; j < socks.length; j++) {
                if (name.equals("Punky") && ! socks[i].equals(socks[j])) {
                    return new String[]{socks[i], socks[j]};
                }
                if (name.equals("Henry") && socks[i].equals(socks[j])) {
                    return new String[]{socks[i], socks[j]};
                }
            }
        }

        return new String[0];
    }
}
