<<<<<<< HEAD
/*
package by.academy.homework2;

public class Task2 {

    for(
    int i = 1;
    i<n;i++)

    {
        String s = arr[i];
        arr[i] = sc.next();
        int unique = getuniqueCharQuantity(s);
        if (minWord == null && minChars > unique) {
            minChars = unique;
            minWord = s
        }
    }
    sc.close();
}
privete static int getuniqueCharQuantity(String s){
    char[] allChars = s.toCharArray();
    char[] charCouunter = new char[256];
    for(Character c : s.toCharArray()){
        charCounter[c]++;
        }
    return 0;
}
*/
=======
package by.academy.homework2;
//Большую часть подсмотрел
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество слов: ");
        int amount = sc.nextInt();
        System.out.println("Введите " + amount + " слов:");
        String[] str = new String[amount];
        int [] Count = new int[amount];

        for (int i = 0; i < amount; i++) {
            str[i] = sc.next();
        }
        char[] ch;
        for (int i = 0; i < str.length; i++) {
            ch = str[i].toCharArray();
            Arrays.sort(ch);
            int count = 1;
            for (int j = 1; j < ch.length; j++) {
                if (ch[j] != ch[j - 1]) {
                    count++;
                }
            }
            Count[i] = count;
        }

        int minValue = Count[0];
        int index = 0;
        for (int i = 0; i < Count.length; i++) {
            if(Count[i] < minValue) {
                minValue = Count[i];
                index = i;
            }
        }

        System.out.print("Слово с минимальным количеством символов: ");
        System.out.print(str[index]);

        sc.close();
    }
}
>>>>>>> origin/main
