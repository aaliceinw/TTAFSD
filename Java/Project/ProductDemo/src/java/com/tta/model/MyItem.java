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
public class MyItem {
    
    int itemid;
   String itemName;
   int qty;
   double price;
   
//create default constructor
    public MyItem() {
    }
   
   //create parameterized constructor

    public MyItem(int itemid, String itemName, int qty, double price) {
        this.itemid = itemid;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }
    
    //create getter and setter

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
