package de.gregorstallmeister.codewars;


public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        StringBuilder stringBuilder = new StringBuilder();

        if (seconds < 3600) {
            stringBuilder.append("00:");
        }
        else {
            int h = (int) Math.floor(seconds / 3600.0);
            stringBuilder.append(h < 10 ? "0" + h : h);
            stringBuilder.append(":");
            seconds -= h * 3600;
        }

        if (seconds < 60) {
            stringBuilder.append("00:");
        }
        else {
            int m = (int) Math.floor(seconds / 60.0);
            stringBuilder.append(m < 10 ? "0" + m : m);
            stringBuilder.append(":");
            seconds -= m * 60;
        }

        stringBuilder.append(seconds < 10 ? "0" + seconds : seconds);

        return stringBuilder.toString();
    }
}
