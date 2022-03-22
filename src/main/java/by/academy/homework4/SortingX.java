package by.academy.homework4;

import java.util.List;
public class SortingX {
    public static void sortSimple(List<Integer> list){
        for (int i = 0; i < list.size(); i++)
            getEl(list, i);
    }

    private static void getEl(List<Integer> list, int index){
        for (int i = list.size() - 1; i > index; i--)
            if (list.get(i - 1) > list.get(i))
                swap(list, i, i - 1);
    }

    private static void swap(List<Integer> list, int i1, int i2){
        list.set(i2, list.get(i2) + list.get(i1));
        list.set(i1, list.get(i2) - list.get(i1));
        list.set(i2, list.get(i2) - list.get(i1));
    }
    public static void printByX(List<Integer> list, int x){
        System.out.println("Меньше чем "+ x);
        int i = 0;

        for (; i < list.size(); i++){
            if (list.get(i) >= x)
                break;
            else
                System.out.print(list.get(i) + " ");
        }

        System.out.println("\nБольше чем "+ x);
        for (; i < list.size(); i++){
            if(list.get(i) == x);
            else
                System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
