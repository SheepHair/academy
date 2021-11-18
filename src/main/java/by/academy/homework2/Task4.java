package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int numberofplayers;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        numberofplayers = scan.nextInt();

        String[] cards = {"Червь", "Бубен", "Пика", "Треф"};
        String[] suit = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        Random rand = new Random();

        for (int i = 1; i <= numberofplayers; i++) {
            System.out.println(";");
            System.out.print("Игрок №" + i+ ":");
            for (int a = 0; a < 5; a++) {
                String card1 = cards[rand.nextInt(cards.length)];
                System.out.print(Arrays.toString(new String[]{card1}));

                String card2 = suit[rand.nextInt(suit.length)];
                System.out.print(Arrays.toString(new String[]{card2}));
                System.out.print(" ");
            }
        }
        System.out.println(";");
        scan.close();
    }
}
