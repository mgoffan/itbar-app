package com.parse.starter;

/**
 * Created by Kevin on 19-May-15.
 */
public class Product {

    private int ID;
    private String name;
    private int price;
    private String desc;

    public Product(int ID, String name, int price, String desc) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
