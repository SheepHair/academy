package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {


    static int pairs(int[] arr, int k) {
        int pairsCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == k) {
                    pairsCount++;
                }
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] - arr[i] == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws IOException {
        System.out.print("Задайте размер массива и значение разности через пробел: ");
        String[] nk = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nk[0]);
                if ((n>=2) && (n<=Math.pow(10, 5))){

                int k = Integer.parseInt(nk[1]);
                if((k>0)&&(k<Math.pow(10, 9))) {

                int[] arr = new int[n];
                System.out.print("Введите "+ n+" значений массива через пробел: ");
                String[] arrItems = scanner.nextLine().split(" ");

                System.out.print("Заданный массив: [ ");
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(arrItems[i]);
                    System.out.print(arr[i]+" ");
                }
                    System.out.print("]");

                int result = pairs(arr, k);
                System.out.println();
                System.out.println("Число пар: "+result);

                scanner.close();
            }
        }
    }
}