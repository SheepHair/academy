package by.academy.classwork.lesson8;

public class Cheese extends Product {


    private int age;

    public Cheese(String type, double price, double numberofproducts, String name, int age) {
        super(type, price, numberofproducts, name);
        this.age = age;
    }
    protected double getDiscount() {
        if (age >= 20) {
            return 0.8;
        }
        return 1;
    }
}
