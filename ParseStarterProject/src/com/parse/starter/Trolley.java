package com.parse.starter;

import java.util.ArrayList;

/**
 * Created by Kevin on 19-May-15.
 */
public class Trolley {

    ArrayList<Product> myTrolley;
    int cant=0;
    int price=0;

    /**
     * Creates a new trolley.
     */
    public Trolley() {
        this.myTrolley = new ArrayList<Product>();
    }

    /**
     * Add product to trolley
     * @param p Product to add into trolley
     */
    public void add(Product p){
        myTrolley.add(p);
        cant+=1;
        price += p.getPrice();
    }

    /**
     * Get total price of all the products you have bought
     * @return Total price
     */
    public int getPrice(){
        return price;
    }

    /**
     * @param percent Integer from 0 to 1. Represents percentage of discount for user if its necessary.
     * @return price with no discount if percent its not a valid number or price with discount if not.
     */
    public int getPrice(int percent){
        if (percent<0 || percent>1){
            return price;
        }else{
            return price*percent;
        }
    }


}
