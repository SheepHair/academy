package by.academy.classwork.lesson8;

import java.sql.SQLOutput;

public class Deal {
    User seller;
    User buyer;
    Product[] products;
/*
    public String printBill(){
        return System.out.println("Потраченные деньги и купленные на них продукты");
    }*/
    public Deal(User seller, User buyer, Product[] products) {
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
