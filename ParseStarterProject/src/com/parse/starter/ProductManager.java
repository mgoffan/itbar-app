package com.parse.starter;

import java.util.ArrayList;

public class ProductManager {

    private static ProductManager self = null;

    Product p1 = new Product(1,"Eatbar 1",41,"Delicia de Kevin");
    Product p2 = new Product(2,"Eatbar 2",57,"Delicia de Goffan");
    Product p3 = new Product(3,"Eatbar 3",70,"Delicia de Capa");
    Product p4 = new Product(4,"Eatbar 4",77,"Delicia de Ioni");

    private ProductManager(){
    }

    public static ProductManager getInstance(){
        if(self == null){
            self = new ProductManager();
        }
        return self;
    }

    public Product getP1(){
        return p1;
    }
    public Product getP2(){
        return p2;
    }
    public Product getP3(){
        return p3;
    }
    public Product getP4(){
        return p4;
    }


    public Product getProductByID(int ID){
        if(ID == p1.getID()){
            return p1;
        }else if(ID == p2.getID()){
            return p2;
        }else if(ID == p3.getID()){
            return p3;
        }else if(ID== p4.getID()){
            return p4;
        }
        return null;
    }
}
