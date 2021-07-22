/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl5;

/**
 *
 * @author joanlaine
 */
public class Item {
    int itemid;
    String dish;
    String price;
    double category;
    
    public static void main(String[] args) {
              
    }
    
      public Item(int itemid, String dish, String price, double category) {
        this.itemid = -1;
        this.dish = "NA";
        this.price = "NA";
        this.category = 0.0;
    }
    
    public Item()
    {
         this.itemid = -1;
        this.dish = "NA";
        this.price = "NA";
        this.category = 0.0;
        
    }
public int getItem(int itemid)
    {
        return itemid;
    }
    public void  setItemid()
    {
        this.itemid = itemid;
    }
    public String getDish()
    {
        return dish;
    }
    public void setDish(String dish)
    {
        this.dish = dish;
    }   
        public String getPrice()
    {
        return price;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }
    
    public double getCategory()
    {
        return category;
    }
    public void setCategory(double category)
    {
        this.category = category;
    }
}
