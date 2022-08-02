package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<MenuItem> results; //search results from searchMenu method

    public Menu () {
        menuItems = new ArrayList<MenuItem>();
        results = new ArrayList<MenuItem>();
    }

    public Menu(ArrayList<MenuItem> existingMenu) {
        for (MenuItem item : existingMenu) {
            menuItems.add(item);
        }
        results = new ArrayList<MenuItem>();
    }

    public void addItem (MenuItem item) {
        menuItems.add(item);
    }

    public void removeItem (String name) {
        for (MenuItem item : menuItems) {
            if (name.equals(item.getName())) {
                System.out.println(item.getName() + " has been removed from the Menu.");
                menuItems.remove(item);
                break;
            }
        }
        System.out.println("No item found");
    }

    public MenuItem getItem(String name) {
        for (MenuItem item : menuItems) {
            if (name.equals(item.getName())) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<MenuItem> searchMenu (String str) {
        results.clear();
        for (MenuItem item : menuItems) {
            if (item.getInfo().contains(str)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<MenuItem> getMenu() {
        return menuItems;
    }


}
