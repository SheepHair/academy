package by.academy.classwork.lesson1;

import by.academy.classwork.lesson2.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5);
        System.out.println(cat1);
//
        Cat cat2 = new Cat(2, "Baki");
        System.out.println(cat2);

        Cat cat3 = new Cat(7, "Larry", 250);
        System.out.println(cat3);
    }
}
