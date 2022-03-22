package by.academy.homework4;

import java.util.*;

public class Call {
    public static void main(String args[]) {
        System.out.println("Студенты");
        Student[] s0 = {
                new Student("Цыркунов", 3),
                new Student("Васильков", 2),
                new Student("Хамутовская", 3),
                new Student("Дурилкин", 1),
                new Student("Новак", 3),
                new Student("Песецкая", 3),
                new Student("Каралькин", 2),
                new Student("Шмыгин", 4),
                new Student("Афингендин", 3),
                new Student("Шнырьков", 4)
        };

        LinkedList<Student> ll0 = new LinkedList<>(Arrays.asList(s0));
        Student.printList(ll0);
        Student.printStudents(ll0, 3);
        System.out.println();

        Student[] s1 = {
                new Student("Попко", 4),
                new Student("Жингилевич", 3),
                new Student("Мисовский", 3),
                new Student("Чекан", 3),
                new Student("Покемонский", 1),
        };

        LinkedList<Student> ll1 = new LinkedList<>(Arrays.asList(s1));
        Student.printList(ll1);
        System.out.println();

        Student[] s2 = {
                new Student("Как", 1),
                new Student("Надоело", 2),
                new Student("Думать", 3),
                new Student("Над", 4),
                new Student("Фамилиями", 1),
                new Student("Цыркунов", 3)
        };

        LinkedList<Student> list2 = new LinkedList<>(Arrays.asList(s2));
        Student.printList(list2);
        System.out.println();
        Student.union(ll0, ll1);
        ll0.sort(Student.comparator);
        Student.printList(ll0);
        System.out.println();
        Student.intersect(ll0, list2);
        ll0.sort(Student.comparator);
        Student.printList(ll0);
        System.out.println();

        TreeSet<Student> treeSet = new TreeSet<>(Student.comparator);
        Collections.addAll(treeSet, s2);
        for (Student s : treeSet) System.out.println(s);

        System.out.println("Сортировка +-");

        SortingPlusMinus sr0 = new SortingPlusMinus<>();

        List<Integer> l0;

        Integer[] arr0 = {1, -2, -3, 2, 3, 0, -4, 4};

        l0 = Arrays.asList(arr0);

        System.out.println("До сортировки: " + l0);
        sr0.sortPlusMinus(l0);
        System.out.println("После сортировки: " + l0);

        System.out.println("Какой-то хоровод на выбывание:");
        String[] individs = {
                "Валя",
                "Вася",
                "Витаклик",
                "Васяндро",
                "Жмых",
                "Женька",
                "Евгений",
                "Алехандро",
                "Толян"
        };
        ArrayList<Individ> al0 = new ArrayList<>();
        LinkedList<Individ> ll2 = new LinkedList<>();
        for (int i = 0; i < individs.length; i++) {
            al0.add(new Individ(i + 1, individs[i]));
            ll2.add(new Individ(i + 1, individs[i]));
        }
        System.out.println("ArrayList: ");

        Individ.printList(al0);

        while (al0.size() > 1) {
            int size = al0.size();
            for (int i = 1; i <= size / 2; i++)
                al0.remove(i);

            Individ.printList(al0);
        }

        System.out.println("LinkedList:");

        Individ.printList(ll0);

        while (ll0.size() > 1) {
            int size = ll0.size();
            for (int i = 1; i <= size / 2; i++)
                ll0.remove(i);

            Individ.printList(ll0);
        }
        System.out.println("Больше меньше X: ");
        List<Integer> l1 = new LinkedList<>();
        l1.add(13);
        l1.add(14);
        l1.add(15);
        l1.add(3);
        l1.add(5);
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        l1.add(12);

        System.out.println(l1);
        SortingX.sortSimple(l1);
        SortingX.printByX(l1, 6);

        System.out.println("Попарное суммирование");

        List<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(4);
        l2.add(5);
        l2.add(3);
        l2.add(5);
        l2.add(1);
        l2.add(3);

        System.out.println(l2);

        while (l2.size() != 1) {
            for (int i = 0; i < l2.size() - 1; i++)
                l2.set(i, l2.get(i) + l2.get(i + 1));

            l2.remove(l2.size() - 1);

            System.out.println(l2);
        }

        System.out.println("Структура хранения чисел:");

        NumberStorageStructure nss = new NumberStorageStructure();
        nss.addNumber(5);
        nss.addNumber(6);
        nss.addNumber(2);
        nss.addNumber(1);

        nss.getList();

        nss.deleteNumber();
        nss.deleteNumber(5);

        nss.getList();

        nss.findClosestNumber(6);
    }
}