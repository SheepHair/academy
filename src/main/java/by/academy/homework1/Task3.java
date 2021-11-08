package by.academy.homework1;

import java.util.Scanner;

public class Task3{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ввести число: ");
    int number = scan.nextInt();
    System.out.println("Таблица умножения для введеного вами числа:");

    for(int i = 0; i<=10; i++){
        System.out.println(number+"*"+i+ "="+number*i);
    }
    scan.close();
}
}

