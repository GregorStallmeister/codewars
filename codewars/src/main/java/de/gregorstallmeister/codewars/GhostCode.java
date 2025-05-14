package de.gregorstallmeister.codewars;

public class GhostCode {
    public static String helloNameFirst(final String name) {
        if (name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }

    public static String helloName(final String name) {
        if (name == null || name.equals(""))
            return "Hello world!";

        return "Hello my name is " + name;
    }
}
