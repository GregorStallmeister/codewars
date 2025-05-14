package de.gregorstallmeister.codewars;

import java.util.List;
import java.util.ArrayList;

public class PushAnObjectIntoArray {
    public static List<String> pushFirstAttempt(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }

    public static List<String> push(){
        return List.of("an object");
    }
}
