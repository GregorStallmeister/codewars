package de.gregorstallmeister.codewars;

import java.util.HashMap;
import java.util.Map;

public class UnexpectedParsing {

    public static Map<String, String> getStatusFirst(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();

        if (isBusy) {
            status.put("status", "busy");
        } else {
            status.put("status", "available");
        }

        return status;
    }

    public static Map getStatus(boolean isBusy) {
        return Map.of("status", isBusy ? "busy" : "available");
    }
}
