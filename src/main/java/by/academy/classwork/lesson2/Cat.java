package by.academy.classwork.lesson2;

public class Cat {
    int age;
    String name;
    double money;

    public Cat() {
        super();
    }

    public Cat(int age) {
        super();
        this.age = age;
    }

    public Cat(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Cat(int age, String name, int money) {
        super();
        this.age = age;
        this.name = name;
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void sleep() {
        System.out.println("Количество сна в день = 11");
    }

    public void eat() {
        System.out.println("Количество приемов пищи в день = 3");

    }

    public void walk() {
        System.out.println("Часов бодрствования 13");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", money=").append(money);
        sb.append('}');
        return sb.toString();
    }
}