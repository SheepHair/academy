package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Namb2 {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел до введенного вами равна: " + sum);
        scan.close();
    }
}
