package Hakaton;

import java.util.Scanner;
import java.util.Arrays;

public class Worker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int people, meetings;
        System.out.print("Enter the number of employees: ");
        people = scan.nextInt();
        /*System.out.print("\nEnter the number of meetings: ");
        meetings = scan.nextInt();*/

        String[][] table = new String[people][4];
        String name;
        for (int i = 0; i <= people; i++) {
            name = scan.toString();
            table[i][0] = new String("Имя" + name);
        }

        System.out.println(people);
       /* System.out.println(meetings);*/
        /*       System.out.print(Arrays.toString(new String[][]{table}));*/
        for (int a = 0; a < table.length; a++) {
            System.out.println();
            for (int j = 0; j < table[people].length; j++) {
                System.out.print(table[people][j] + " ");
            }
            scan.close();
        }
    }
}
