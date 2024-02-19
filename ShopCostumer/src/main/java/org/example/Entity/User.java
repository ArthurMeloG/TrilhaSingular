package org.example.Entity;

public class User {

    public Integer ID;

    public String name;

    protected User(Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "ID: " + ID + " Name: " + name + "\n";
    }
}
