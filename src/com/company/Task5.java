package com.company;

// Stwórz funkcje static pod funkcja main, która będzie pobierać tablice typu double
// i zwraca zmodyfikowaną tablice bezwzględną (tzn wszystkie
// jej elementy powinny być dodanie jeśli były wcześniej ujemne)

public class Task5 {
    public static void main(String[] args) {
        double[] values = new double [] {-1,-2,-3,1,2,3};

        double[] onlyPositibeValues = getPositiveValues(values);

        for(double positiveValue : onlyPositibeValues) {
            System.out.println(positiveValue);
        }
    }



    public static double[] getPositiveValues(double [] originalValues) {
        double[] onlyPositiveValues = new double[originalValues.length];
        for (int i = 0; i < originalValues.length; i++) {
            onlyPositiveValues[i] = Math.abs(originalValues[i]);
        }
        return onlyPositiveValues;
    }
}
