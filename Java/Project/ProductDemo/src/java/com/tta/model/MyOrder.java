/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tta.model;

/**
 *
 * @author joanlaine
 */
public class MyOrder {
 
    String itemName;
    int itemid;
    double price;

    //create default constructor
    public MyOrder() {
    }

    //create parameterised constructor
    public MyOrder(String itemName, int itemid, double price) {
        this.itemName = itemName;
        this.itemid = itemid;
        this.price = price;
    }
    
    //create getter and setter

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
