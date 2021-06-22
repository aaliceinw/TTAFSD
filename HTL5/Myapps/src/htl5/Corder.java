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
public class Corder {
    
    int corderid;
    String cname;
    String phone;
    String address;
    String itemid;
    int qty;
    double total;
    String date;
    
    public static void main(String[] args) {   
    }
        
        public Corder(int corderid, String cname, String phone, String address, String itemid, int qty, double total, String date){ 
        this.corderid = -1;
        this.cname = "NA";
        this.phone = "NA";
        this.address = "NA";
        this.itemid = "NA";
        this.qty = 1;
        this.total = 0.0;
        this.date = "NA";
        
    }
    
    public Corder()
    {
        this.corderid = -1;
        this.cname = "NA";
        this.phone = "NA";
        this.address = "NA";
        this.itemid = "NA";
        this.qty = 1;
        this.total = 0.0;
        this.date = "NA";
        
    }
    
    
    public int getCordid(int corderid)
    {
        return corderid;
    }
    public void  setCorderid()
    {
        this.corderid = corderid;
    }
    public String getCname()
    {
        return cname;
    }
    public void setCname(String cname)
    {
        this.cname = cname;
    }   
        public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
   
    public String getItemid()
    {
        return itemid;
    }
    public void setItemid(String itemid)
    {
        this.itemid = itemid;
    }
    
    public double getTotal()
    {
        return total;
    }
    public void setTotal(double total)
    {
        this.total = total;
    }
    
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
   
}
