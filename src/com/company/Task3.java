package com.company;

//Używając pętli while, zrób sumę liczb od 1 do 500 i ją wyświetl.

public class Task3 {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        while(counter < 501) {
            sum += counter;
            counter++;
        }
        System.out.println("Suma liczb od 1 do 500 wynosi: " + sum);
    }
}
