package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main (String[] args) {
        ArrayList<MenuItem> myBucket = new ArrayList<>();

        MenuItem baconBrusselSprout = new MenuItem("Bacon-wrapped Brussels Sprouts", "They're wrapped in bacon and cannot be good for your cholesterol","Appetizer", 15.22);
        MenuItem banhMi = new MenuItem("Banh Mi", "It's a really nice sandwitch", "Entree", 9.99);
        MenuItem flan = new MenuItem("Flan", "Type 2 Diabetes", "Dessert", 2.34);

        myBucket.add(baconBrusselSprout);
        myBucket.add(banhMi);
        myBucket.add(flan);

        Menu myMenu = new Menu(myBucket);
       //System.out.println(myMenu.getLastUpdated());
        //myMenu.showAll();


        MenuItem poutine = new MenuItem("Poutine", "Oh Canada, this is really good, and I'm Very Upset that my Costco doesn't serve these", "Appetizer", 5.99);

//        myMenu.remove();
//        myMenu.add(poutine);
//        myMenu.showAll();
//        myMenu.showItem();

        myMenu.showLastUpdated();

        ArrayList<MenuItem> myItems = new ArrayList<>();


    }
}
