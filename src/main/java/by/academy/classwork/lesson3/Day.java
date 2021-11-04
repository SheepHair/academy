package by.academy.classwork.lesson3;

public class Day {
    public static void main(String[] args) {

        int i = 2;

        switch (i) {

            case 1:
            System.out.println("Понедельник");
            break;

            case 2:
            System.out.println("Вторник");
            break;

            case 3:
            System.out.println("Среда");
            break;

            case 4 :
            System.out.println("Четверг");
            break;

            case 5:
            System.out.println("Пятница");
            break;

            case 6:
            System.out.println("Суббота");
            break;

            case 7:
            System.out.println("Воскресенье");
            break;

            default:
                System.out.println("Дня с таким номером не существует");
        }
    }
}
