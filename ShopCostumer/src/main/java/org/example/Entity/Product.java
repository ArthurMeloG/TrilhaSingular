package org.example.Entity;

public class Product extends Entity {

    private Integer ID;
    private String name;
    private Integer price;
    private Integer amount;

    protected Product(Integer ID, String name, Integer price, Integer amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product(String name, Integer price, Integer amount) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return price;
    }

    public void setValue(Integer value) {
        this.price = value;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return
            "ID: " + ID + "\n" +
            "Name: " + name + "\n" +
            "Price: " + price + "\n" +
            "Amount: " + amount + "\n";
    }

}
