package com.company;

public class PrintMean {

    public static void main(String[] args) {
        // Heltalsdivision (skriver ut int istället för double)
        //Test
        System.out.println("Mean of 3, 1, 3, 3: " + meanCalc(3, 1, 3, 3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2, 3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        // Gör en sträng av "mean"

        String mean = String.valueOf((a + b + c + d) / 4.0);
        String meanString = mean;

        return meanString;
    }
}