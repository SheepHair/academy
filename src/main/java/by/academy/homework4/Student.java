package by.academy.homework4;

import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    public final String name;
    public final int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    private String getName(){
        return name;
    }

    private int getCourse(){
        return course;
    }

    public static void printStudents(LinkedList<Student> students, int course){
        System.out.println("Студенты " + course + " курса:");

        for (Student s : students) {
            if (s.getCourse() == course)
                System.out.println(s.getName());
        }
    }

    public static void union(LinkedList<Student> list0, LinkedList<Student> list1){
        list0.addAll(list1);
    }

    public static void intersect(LinkedList<Student> list0, LinkedList<Student> list1){
        list0.retainAll(list1);
    }

    public static void printList(LinkedList<Student> students){
        for (Student s : students) System.out.println(s);
    }

    public static Comparator<Student> comparator =
            Comparator.comparingInt(Student::getCourse).thenComparing(Student::getName);

    @Override
    public String toString(){
        return "Имя: " + getName() + " Курс: " + getCourse();
    }

    @Override
    public boolean equals(Object o){
        Student s = (Student) o;
        return getName().equals(s.getName()) &&
                getCourse() == s.getCourse();
    }
}