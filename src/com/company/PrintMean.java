package com.company;

public class PrintMean {

    public static void main(String[] args) {
        // Heltalsdivision (skriver ut int istället för double)
        //Test
        System.out.println("Mean of 3, 1, 3, 3: " + meanCalc(3, 1, 3, 3));
        System.out.println("Mean of 5, 1, 3, 3: " + meanCalc(5, 1, 3, 3));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, 3, -4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));
        System.out.println("Mean of 5, 6, 123, 68: " + meanCalc(5, 6, 123, 68));
        System.out.println("Mean of -23, -12, 45, 45: " + meanCalc(-23, -12, 45, 45));
    }

    public static String meanCalc(int a, int b, int c, int d) {
        // Gör en sträng av "mean"

        String mean = String.valueOf((a + b + c + d) / 4.0);
        String meanString = mean;
        System.out.println("good job");
        
        return meanString;
    }
}