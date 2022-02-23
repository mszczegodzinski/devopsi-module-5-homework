package com.company;

//Napisz program, który obliczy średnia liczb z tablicy int i na jej podstawie wystawi ocenę
// (char) (A >=4, B >=3 i <4, C < 3), następnie używając switch
// wyświetla odpowiedni komunikat w zależności od oceny
// A=Super, B=Srednio, C=Slabo, Domsylnie= cos nie tak…)

public class Task4 {
    public static void main(String[] args) {
        int[] grades = new int[20];

        // fill grades with random numbers from range <2,5>
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int)((Math.round((Math.random() * 3 + 2))));
        }

        int gradesSum = 0;
        for (int grade : grades) {
            gradesSum += grade;
        }
        // caluculate average
        double averageGrade = ((double) gradesSum / grades.length);
        System.out.println(averageGrade);

        // change average to letter grade
        char charGrade = averageGrade < 3 ? 'C'
                        : averageGrade < 4 ? 'B' : 'A';

        switch(charGrade) {
            case 'A' -> System.out.println("Super");
            case 'B' -> System.out.println("średnio");
            case 'C' -> System.out.println("słabo");
            default -> System.out.println("coś poszło nie tak");
        }

    }
}
