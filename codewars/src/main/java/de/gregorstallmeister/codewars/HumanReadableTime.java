package de.gregorstallmeister.codewars;


import java.sql.Time;
import java.time.Duration;

public class HumanReadableTime {
    public static String makeReadableFirst(int seconds) {
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

    public static String makeReadableSecond(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    public static String makeReadable(int seconds) {
        Duration duration = Duration.ZERO.plusSeconds(seconds);

        return String.format("%02d:%02d:%02d", duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());
    }
}
