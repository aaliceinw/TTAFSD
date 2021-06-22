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
public class Manager {
  int mid;
    String mname;
    String shift;
    double salary;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
   
    public Manager(int mid, String mname, String shift, double salary) {
    this.mid = -2;
    this.mname = "NA";
    this.shift ="NA";
    this.salary = -1.0;
    }
    
    public Manager() {
    this.mid = 2;
    this.mname = "NA";
    this.shift = "NA";
    this.salary = 0.0;
    }
    
    public int getMid(int mid)
    {
        return mid;
    }
    public void  setMid()
    {
        this.mid = mid;
    }
    public String getMname()
    {
        return mname;
    }
    public void setMname(String mname)
    {
        this.mname = mname;
    }   
        public String getShift()
    {
        return shift;
    }
    public void setShift(String shift)
    {
        this.shift = shift;
    }
    
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
   
}


