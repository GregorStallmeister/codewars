package de.gregorstallmeister.codewars;

public class StringInterlacing {
    public static String interlaceFirst(final String first, final String second) {
        StringBuilder resultBuilder = new StringBuilder();
        String firstString = first.replace(" ", "").replace("\t", "");
        String secondString = second.replace(" ", "").replace("\t", "");

        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                resultBuilder.append(firstString.charAt(i));
                resultBuilder.append(secondString.charAt(i));
            }
        }

        if (firstString.length() > secondString.length()) {
            StringBuilder secondStringElongedBuilder = new StringBuilder();
            while (secondStringElongedBuilder.length() < firstString.length()) {
                secondStringElongedBuilder.append(secondString);
            }
            for (int i = 0; i < firstString.length(); i++) {
                resultBuilder.append(firstString.charAt(i));
                resultBuilder.append(secondStringElongedBuilder.charAt(i));
            }
        }

        if (firstString.length() < secondString.length()) {
            StringBuilder firstStringElongedBuilder = new StringBuilder();
            while (firstStringElongedBuilder.length() < secondString.length()) {
                firstStringElongedBuilder.append(firstString);
            }
            for (int i = 0; i < secondString.length(); i++) {
                resultBuilder.append(secondString.charAt(i));
                resultBuilder.append(firstStringElongedBuilder.charAt(i));
            }
        }

        // mix string parameters into result
        return resultBuilder.toString();
    }

    public static String interlace(String first, String second) {
       first = first.replace(" ", "");
       second = second.replace(" ", "");

       if (first.length() < second.length()) {
           return interlace(second, first);
       }

       StringBuilder resultBuilder = new StringBuilder();

       for (int i = 0; i < first.length(); i++) {
           resultBuilder.append(first.charAt(i));
           resultBuilder.append(second.charAt(i % second.length()));
       }

       return resultBuilder.toString();
    }
}
