package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class Item {
    private String name;
    private double price;
    private String[] category = new String[] {"Appetizer", "Main Course", "Dessert"};
    private String description;
    private Date date;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item(String name, double price, String[] category, String description, Date date) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public Item(Item item) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public String getInfo() {
        return name + "; " + price + "; " + category + "; " + description + "; " + date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
