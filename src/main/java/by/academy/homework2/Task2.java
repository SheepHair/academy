package by.academy.homework2;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сколько будет слов:");
        int number = sc.nextInt();
        System.out.println("Введите " + number + " слов:");
        String[] str = new String[number];
        char[] ch = new char[str.length];
        int[] countСhar = new int[number];

        for (int i = 0; i < number; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < str.length; i++) {
            ch = str[i].toCharArray();
            Arrays.sort(ch);
            int count = 1;
            for (int j = 1; j < ch.length; j++) {
                if (ch[j] != ch[j - 1]) {
                    count++;
                }
            }
            countСhar[i] = count;
        }

        int minValue = countСhar[0];
        int index = 0;
        for (int i = 0; i < countСhar.length; i++) {
            if(countСhar[i] < minValue) {
                minValue = countСhar[i];
                index = i;
            }
        }

        System.out.println("Cлово, в котором число различных символов минимально:");
        System.out.println(str[index]);

        sc.close();
    }}
   /* private static int getUniqueCharQuantity(String s) {
        int []charCounter = new int[256];
        char[]allChars = s.toCharArray();

        for (Character c:allChars) {
            charCounter[c]++;
        }
        int uniqueCounter = 0;
        for (int i = 0;i<charCounter.length;i++) {
            int counter =charCounter[i];
            if (counter>0) {
                uniqueCounter++;
            }
        }
        return uniqueCounter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ведите кол-во строк");
        int n = sc.nextInt();
        String [] arr= new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("введите слово");
            arr[i]=sc.next();

        }

        int minChars = -1;
        String minWord = null;

        for (int i=1;i<n;i++) {
            String s = arr[i];
            arr[i] = sc.next();
            int unique = getUniqueCharQuantity(s);
            if(minWord==null&&minChars>unique) {
                minChars = unique;
                minWord = s;
            }

        }
        System.out.println(minWord);
        sc.close();
    }
}
*/
    /*    private static int diff(String str){ // число уникальных символов
            StringBuffer symbol = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
            String smb; // текущий символ в строке
            for (int i=0;i<str.length();i++) { // обход строки
                smb = String.valueOf(str.charAt(i)); // получить текущий символ
                if (symbol.indexOf(smb)==-1) // символ еще не встречался
                    symbol.append(smb); // добавляем
            }

            return symbol.length(); // возвращаем длину получившейся строки
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во строк");
            int n = sc.nextInt();
            String [] arr= new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Введите слово");
                arr[i] = sc.next();
            }
            String[] a = arr[i];
            String goal = a[0]; // искомое слово
            System.out.println("Массив: ");
            for (int i=1;i<a.length;i++){
                System.out.print(a[i]+", "); // выводим очередной элемент
                if ( diff(a[i])<diff(goal))
                    goal = a[i]; // новый мин.эл
            }
            System.out.println("");
            System.out.println("Искомое слово: "+goal+", число разных символов: "+diff(goal));
        }*/
   /* public static void main(String[] args){
    }}


    *//*    int n; //количество строк
        String[] text;
        Scanner scan = new Scanner(System.in);
        if (scan.Nextint()) { // возвращает истинну если с потока ввода можно считать целое число
            n = Integer.parseInt(scan.nextLine());
            int indexMax = 0;
            int indexMin = 0;
            text = new String[n]; //массив строк

            for (int i = 0; i < n; i++) {
                text[i] = scan.nextLine();
                if (text[i].length() <= text[indexMin].length())
                    indexMin = i;
                if (text[i].length() >= text[indexMax].length())
                    indexMax = i;
            }

            //System.out.println("Количество строк:" + n );
            System.out.printf("MIN (%d): \"%s\"%n", text[indexMin].length(), text[indexMin]);
            System.out.printf("MAX (%d): \"%s\"%n", text[indexMax].length(), text[indexMax]);
        }
    }*/
