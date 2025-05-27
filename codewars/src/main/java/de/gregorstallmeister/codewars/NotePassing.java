package de.gregorstallmeister.codewars;

public class NotePassing {
    public static String decipherFirst(String codedMessage){
        char[] codedMessageChars = codedMessage.toCharArray();
        StringBuilder decipheredMessageBuilder = new StringBuilder();

        for (char c: codedMessageChars) {
            switch (c) {
                case 'A' -> decipheredMessageBuilder.append('H');
                case 'a' -> decipheredMessageBuilder.append('h');
                case 'B' -> decipheredMessageBuilder.append('I');
                case 'b' -> decipheredMessageBuilder.append('i');
                case 'C' -> decipheredMessageBuilder.append('J');
                case 'c' -> decipheredMessageBuilder.append('j');
                case 'D' -> decipheredMessageBuilder.append('K');
                case 'd' -> decipheredMessageBuilder.append('k');
                case 'E' -> decipheredMessageBuilder.append('L');
                case 'e' -> decipheredMessageBuilder.append('l');
                case 'F' -> decipheredMessageBuilder.append('M');
                case 'f' -> decipheredMessageBuilder.append('m');
                case 'G' -> decipheredMessageBuilder.append('N');
                case 'g' -> decipheredMessageBuilder.append('n');
                case 'H' -> decipheredMessageBuilder.append('O');
                case 'h' -> decipheredMessageBuilder.append('o');
                case 'I' -> decipheredMessageBuilder.append('P');
                case 'i' -> decipheredMessageBuilder.append('p');
                case 'J' -> decipheredMessageBuilder.append('7');
                case 'j' -> decipheredMessageBuilder.append('7');
                case 'K' -> decipheredMessageBuilder.append('R');
                case 'k' -> decipheredMessageBuilder.append('r');
                case 'L' -> decipheredMessageBuilder.append('S');
                case 'l' -> decipheredMessageBuilder.append('s');
                case 'M' -> decipheredMessageBuilder.append('T');
                case 'm' -> decipheredMessageBuilder.append('t');
                case 'N' -> decipheredMessageBuilder.append('U');
                case 'n' -> decipheredMessageBuilder.append('u');
                case 'O' -> decipheredMessageBuilder.append('V');
                case 'o' -> decipheredMessageBuilder.append('v');
                case 'P' -> decipheredMessageBuilder.append('W');
                case 'p' -> decipheredMessageBuilder.append('w');
                case 'Q' -> decipheredMessageBuilder.append('7');
                case 'q' -> decipheredMessageBuilder.append('7');
                case 'R' -> decipheredMessageBuilder.append('Y');
                case 'r' -> decipheredMessageBuilder.append('y');
                case 'S' -> decipheredMessageBuilder.append('7');
                case 's' -> decipheredMessageBuilder.append('7');
                case 'T' -> decipheredMessageBuilder.append('A');
                case 't' -> decipheredMessageBuilder.append('a');
                case 'U' -> decipheredMessageBuilder.append('B');
                case 'u' -> decipheredMessageBuilder.append('b');
                case 'V' -> decipheredMessageBuilder.append('C');
                case 'v' -> decipheredMessageBuilder.append('c');
                case 'W' -> decipheredMessageBuilder.append('D');
                case 'w' -> decipheredMessageBuilder.append('d');
                case 'X' -> decipheredMessageBuilder.append('E');
                case 'x' -> decipheredMessageBuilder.append('e');
                case 'Y' -> decipheredMessageBuilder.append('F');
                case 'y' -> decipheredMessageBuilder.append('f');
                case 'Z' -> decipheredMessageBuilder.append('G');
                case 'z' -> decipheredMessageBuilder.append('g');
                default -> decipheredMessageBuilder.append(c);
            }
        }

        return decipheredMessageBuilder.toString();
    }

    public static String decipher(String codedMessage){
        StringBuilder decipheredMessageBuilder = new StringBuilder();
        String charsCiphered = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String charsDecoded =  "hijklmnopqrstuvwxyzabcdefgHIJKLMNOPQRSTUVWXYZABCDEFG";

        for (int i = 0; i < codedMessage.length(); i++) {
            int idx = charsCiphered.indexOf(codedMessage.charAt(i));
            if (idx != -1) {
                decipheredMessageBuilder.append(charsDecoded.charAt(idx));
            }
            else {
                decipheredMessageBuilder.append(codedMessage.charAt(i));
            }
        }

        return decipheredMessageBuilder.toString();
    }
}
