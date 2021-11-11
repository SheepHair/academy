package by.academy.classwork.lesson7;

public class Product {

        double price;
        String name;
        String type;

        public Product() {
            super();
        }
        public Product (double price, String name, String type) {
            super();
            this.name = name;
            this.type = type;
            this.price = price;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

