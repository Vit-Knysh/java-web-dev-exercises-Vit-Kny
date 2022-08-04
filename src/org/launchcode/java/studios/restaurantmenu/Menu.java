package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;

    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void add (MenuItem item) {
        this.items.add(item);
    }

    public void simpleRemove (int index) {
        this.items.remove(index);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void showLastUpdated() {
        System.out.println(String.format("The menu was last updated on: %s", this.getLastUpdated()));
    }

    public void remove () {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number corresponding to the menu item you would like to remove: ");
        this.showAll();
        int indexToDelete = (input.nextInt() - 1);
        input.close();

        this.items.remove(indexToDelete);
    }

    public void simpleShowItem(int index) {
        MenuItem theItem = this.items.get(index);
        System.out.println(theItem.getName() + ": " + theItem.getPrice());
    }

    public void showItem() {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Select a number from %s to %s corresponding to the menu item you would like to show: ", 1, this.items.size()));
        int indexToShow = (input.nextInt() - 1);
        input.close();
        this.simpleShowItem(indexToShow);
    }

    public void showAll() {
        for (int i = 0; i < this.items.size(); i++) {
            MenuItem theItem = this.items.get(i);
            System.out.println(String.format("%s) %s: %s", i + 1,theItem.getName(), theItem.getPrice()));
        }
    }

}
