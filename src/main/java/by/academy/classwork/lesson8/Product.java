package by.academy.classwork.lesson8;

public class Product {
    String type;
    double price;
    int numberofproducts;
    String name;

    public double Discount(){
        return 0;
    }
    public double detFullprise(){
        return  numberofproducts*price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberofproducts() {
        return numberofproducts;
    }

    public void setNumberofproducts(int numberofproducts) {
        this.numberofproducts = numberofproducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}