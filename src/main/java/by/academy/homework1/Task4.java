package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Степень 2 до 1.000.000: ");
        int i = 2;
        for (int a = 0; Math.pow(i, a)<= 1000000; a++)
        {
            System.out.print(a+", ");
        }
    }
}
