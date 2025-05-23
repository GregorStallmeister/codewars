package de.gregorstallmeister.codewars;

public class Primitive {

    public String determineType(String number) {
        try {
            Byte.parseByte(number);
            return "byte";
        } catch (NumberFormatException ignored) {}
        try {
            Short.parseShort(number);
            return "short";
        } catch (NumberFormatException ignored) {}
        try {
            Integer.parseInt(number);
            return "int";
        } catch (NumberFormatException ignored) {}
        try {
            Long.parseLong(number);
            return "long";
        } catch (NumberFormatException ignored) {}

        return "none";
    }
}
