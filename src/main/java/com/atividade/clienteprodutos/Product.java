package com.atividade.clienteprodutos;

import java.util.Date;

public class Product {
    private String name;
    private double price;
    private Date date = new Date();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public Product() {}

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
