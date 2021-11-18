/*
package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любой тип данных: ");
        String type = scan.nextLine();

        switch (type) {

            case "int":
                System.out.print("Введите число: ");
                int z = scan.nextInt();
                System.out.println("Остаток от деления на 2 равняется " + z % 2);
                break;
            case "double":
                System.out.print("Введите число с плавающей точкой: ");
                double x = scan.nextDouble();
                System.out.println("70% от введенного числа равняется " + x * 0.7);
                break;
            case "float":
                System.out.print("Введите число: ");
                float c = scan.nextFloat();
                System.out.println("Квадрат числа равняется " + Math.pow(c, 2));
                break;
            case "char":
                System.out.print("Введите символ: ");
                char v = scan.next().charAt(0);
                System.out.println("Код символа " + (int) v);
                break;
            case "String":
                System.out.print("Введите данные: ");
                String b = scan.nextLine();
                System.out.println("Hello " + b);
                break;
            default:
                System.out.print("Введенные данные ничему не соответствуют: ");
                break;
        }

        scan.close();
    }
}
*/
