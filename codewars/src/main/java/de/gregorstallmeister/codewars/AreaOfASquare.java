package de.gregorstallmeister.codewars;

import java.text.DecimalFormat;

public class AreaOfASquare {
    public static double squareArea(double A){
        double wholeSquareHeight = (A * 4) / Math.PI;
        String numberToReturn = new DecimalFormat("0.00").format (wholeSquareHeight * wholeSquareHeight / 4.0);
        return Double.parseDouble(numberToReturn.replace(',', '.'));
    }
}
