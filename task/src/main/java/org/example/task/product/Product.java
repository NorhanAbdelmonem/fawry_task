package org.example.task.product;

import java.time.LocalDate;

public  class Product {
    public String name;
    private double price;
    private int quantity;
    private boolean isExpirable;
    private LocalDate expirationDate;
    private boolean isShippable;
    private int weight;

    public Product(String name, double price, int quantity,
                   boolean isExpirable, LocalDate expirationDate,
                   boolean isShipplable,int weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpirable = isExpirable;
        this.expirationDate = expirationDate;
        this.isShippable = isShipplable;
        this.weight = weight;


    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isExpirable() {
        return isExpirable;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public boolean isShippable() {
        return isShippable;
    }
    public boolean isExpired() {
        return isExpirable && expirationDate.isBefore(LocalDate.now());
    }
    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

}