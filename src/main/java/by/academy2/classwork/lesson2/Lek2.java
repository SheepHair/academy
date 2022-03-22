package by.academy2.classwork.lesson2;

import java.util.Scanner;

public class Lek2 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ссумируеммые числа: ");

        a = scan.nextInt();
        b = scan.nextInt();

        c = a + b;
        System.out.println("Сумма равна " +c);
    }
    }
