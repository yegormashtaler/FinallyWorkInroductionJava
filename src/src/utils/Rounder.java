package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static void roundingMethod() {
        double value = 34.766674;
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(value);
        System.out.print(result);
    }
}
