package by.academy.classwork.lesson12;

public class User {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.setAccount("qwerty");
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    Person(String name) {
        this.name = name;
    }

    public void setAccount(String password) {
        class Account {

            void display() {
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}

