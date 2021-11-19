package by.academy.homework2;
;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int numberofplayers;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        numberofplayers = scan.nextInt();

        String[] suit = {"Червь1", "Червь2", "Червь3", "Червь4", "Червь5", "Червь6", "Червь7", "Червь8", "Червь9", "Червь10", "ЧервьВалет", "ЧервьДама", "ЧервьКороль", "ЧервьТуз",
                "Бубен1", "Бубен2", "Бубен3", "Бубен4", "Бубен5", "Бубен6", "Бубен7", "Бубен8", "Бубен9", "Бубен10", "БубенВалет", "БубенДама", "БубенКороль", "БубенТуз",
                "Пика1", "Пика2", "Пика3", "Пика4", "Пика5", "Пика6", "Пика7", "Пика8", "Пика9", "Пика10", "ПикаВалет", "ПикаДама", "ПикаКороль", "ПикаТуз",
                "Треф1", "Треф2", "Треф3", "Треф4", "Треф5", "Треф6", "Треф7", "Треф8", "Треф9", "Треф10", "ТрефВалет", "ТрефДама", "ТрефКороль", "ТрефТуз"};


        Random rand = new Random();

        for (int i = suit.length - 1; i > 0; i--) {    // перетусовка методом Fisher–Yates, взял от сюда(http://developer.alexanderklimov.ru/android/java/array.php)
            int index = rand.nextInt(i + 1);
            // Simple swap
            String a = suit[index];
            suit[index] = suit[i];
            suit[i] = a;
        }
        int t = 0;
        for (int i = 1; i <= numberofplayers; i++) {
            System.out.println(";");
            System.out.print("Игрок №" + i+ ":");
            for (int j = 0; j < 5; j++) {
                System.out.print(suit[t]+", ");
                t++;
            }
        }
        System.out.println(";");
        scan.close();
    }
}
   /*     for (int i = 1; i <= numberofplayers; i++) {
            System.out.println(";");
            System.out.print("Игрок №" + i+ ":");
            for (int a = 0; a < 5; a++) {
                String card1 = cards[rand.nextInt(cards.length)];
                System.out.print(Arrays.toString(new String[]{card1}));

                String card2 = suit[rand.nextInt(suit.length)];
                System.out.print(Arrays.toString(new String[]{card2}));
                System.out.print(" ");
            }
        }*/


