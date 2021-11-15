package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую строку: ");

            String str1 = scanner.nextLine();
            System.out.print("Введите вторую строку: ");

            String str2 = scanner.nextLine();

            char[] firststr = str1.toCharArray();
            char[] secondstr = str2.toCharArray();
            char[] arr3 = new char[str1.length()];


            if (str1.length() == str2.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    for (int j = 0; j < str1.length(); j++) {
                        if (firststr[i] == secondstr[j]) {
                            arr3[i] = secondstr[j];
                        }
                    }
                }
            }
            else
            System.out.println("Не являются");
                if (Arrays.equals(firststr, arr3)) {
                    System.out.println("Являются");
                } else
                    System.out.println("Не являются");

            scanner.close();
        }
    }