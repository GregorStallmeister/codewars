package de.gregorstallmeister.codewars;

public class GrassHopper {

    public static String weatherInfoFirst(int temp) {
        double c = convertToCelsius (temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5/9.0);
    }

    public static String weatherInfo(int temp) {
        double tempCelsius = (temp - 32) * (5/9.0);
        return tempCelsius + " is" + (tempCelsius > 0 ? " above" : "") + " freezing temperature";
    }
}
