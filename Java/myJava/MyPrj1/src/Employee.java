
/**
 *
 * @author joanlaine
 */


public class Employee {
  
    int eid;
    String ename;
    String address;
    double salary;
    
      public Employee(int eid,String ename, String address, double Salary) {
        this.eid = -1;
        this.ename ="NA";
        this.address ="NA";
        this.salary = 0.0;
        
}//constructor
  //create getter/setter here

    Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
      
}//class

