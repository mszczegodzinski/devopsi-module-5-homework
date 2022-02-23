package com.company;

//Zadeklaruj tablice 10 liczb typu int i przeiteruj po niej od indexu 0 do 19 (od 1 do 20).
// W czasie iteracji sprawdź czy dana liczba jest parzysta (liczba%2==0),
// jeśli tak to wyświetla napis “Liczba X jest parzysta”, gdzie X to dana liczba,
// w przeciwnym wypadku wyświetl sama liczbe.

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int element : arr) {
            if(element % 2 == 0) {
                System.out.println("Liczba " + element + " jest parzysta");
            } else {
                System.out.println(element);
            }
        }
    }
}
