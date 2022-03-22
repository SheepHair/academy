package by.academy.homework4;

import java.util.List;

public class Individ {
    public final int num;
    public final String name;

    public Individ(int num, String name){
        this.num = num;
        this.name = name;
    }
    public static void printList(List list){
        for (Object o : list) System.out.println(o);
        System.out.println();
    }
    @Override
    public String toString(){
        return num + " - " + name;
    }
}
