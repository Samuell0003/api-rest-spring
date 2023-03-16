package com.atividade.clienteprodutos;

import java.util.ArrayList;

public class Client {
    private String name;
    private int age;
    private ArrayList<Product> product = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Client() {}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(Product product) {
        this.product.add(product);
    }
    
}
