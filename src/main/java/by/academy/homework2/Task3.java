package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое слово с четным количеством букв: ");
        String str1 = scan.nextLine();
        int i =str1.length();

        System.out.print("Введите второе слово с таким же условием: ");
        String str2 = scan.nextLine();
        int a =str2.length();
        str1 = str1.substring(0, i / 2);
        str2 = str2.substring(a / 2);
        System.out.print("Полученный результат: ");
        String b;
        b = str1 + str2;
        System.out.println(b);

        scan.close();
    }
}
