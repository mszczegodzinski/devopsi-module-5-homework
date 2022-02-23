package com.company;

// Stwórz funkcje static pod funkcja main, która będzie pobierać imię (String)
// i zwracać typ enum MEN, WOMEN w zależności od tego czy imię jest męskie czy nie.

public class Task6 {
    public static void main(String[] args) {
        String name1 = "Anna";
        String name2 = "Barbara";
        String name3 = "Marcin";

        Gender result1 = getGender(name1);
        Gender result2 = getGender(name2);
        Gender result3 = getGender(name3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static Gender getGender(String name) {
        if(name.endsWith("a")) {
            return Gender.WOMAN;
        }
        return Gender.MAN;
    }

}

enum Gender {
    MAN, WOMAN
}
