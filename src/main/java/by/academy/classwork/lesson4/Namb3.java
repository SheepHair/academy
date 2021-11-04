package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Namb3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        sum = i + ++i;
        for ( i = 2; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println("Произведение всех чисел до введенного вами равна: " + sum);
        sc.close();
    }
}
