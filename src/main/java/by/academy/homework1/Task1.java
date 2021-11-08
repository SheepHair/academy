package by.academy.homework1;

import java.math.BigDecimal; //Для исчисления денег
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal z = new BigDecimal("100.00"); // до 100
        BigDecimal x = new BigDecimal("200.00"); // до 200
        BigDecimal c = new BigDecimal("300.00"); // до 300
        BigDecimal v = new BigDecimal("400.00");// до 400
        BigDecimal b = new BigDecimal("0.00");// больше 400
   System.out.print("Введите возраст покупателя: ");
        int age = scan.nextInt(); // ввод возраста
        System.out.print("Введите сумму траты: ");
        BigDecimal Spending = scan.nextBigDecimal(); // Сумма покупки

        if (Spending.compareTo(z) < 0) // покупка до 100
        {
            System.out.print("Потраченная сумма: "+ (Spending.subtract(Spending.multiply(new BigDecimal("0.05")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.05"))));
        }
        else if(Spending.compareTo(z) >= 0 & Spending.compareTo(x) < 0) // [100;200)
        {
            System.out.print("Потраченная сумма: "+ (Spending.subtract(Spending.multiply(new BigDecimal("0.07")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.07"))));
        }
        else if(age <= 18 & Spending.compareTo(x) >= 0 & Spending.compareTo(c) < 0)// [200;300), а так же условие с возрастом где меньше 18
        {
            System.out.print("Потраченная сумма: " + (Spending.subtract(Spending.multiply(new BigDecimal("0.09")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.09"))));
        }
        else if(age > 18 & Spending.compareTo(x) >= 0 & Spending.compareTo(c) < 0)// [200;300), условие с возрастом где больше 18
        {
            System.out.print("Потраченная сумма: " + (Spending.subtract(Spending.multiply(new BigDecimal("0.16")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.16"))));
        }
        else if(Spending.compareTo(c) >= 0 & Spending.compareTo(v) < 0)// [300;400)
        {
            System.out.print("Потраченная сумма: "+ (Spending.subtract(Spending.multiply(new BigDecimal("0.15")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.15"))));
        }
        else if(Spending.compareTo(v) >= 0)// [400; и тд
        {
            System.out.print("Потраченная сумма: "+ (Spending.subtract(Spending.multiply(new BigDecimal("0.20")))));
            System.out.println(" Вычет скидки: "+ (Spending.multiply(new BigDecimal("0.20"))));
        }
        scan.close();
    }

}

