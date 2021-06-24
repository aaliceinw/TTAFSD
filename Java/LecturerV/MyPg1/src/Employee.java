public class Employee {
  
    int eid;
    String ename;
    String address;
    double salary;
   
//default constructer
    public Employee() {
        this.eid = -1;
        this.ename = "john";
        this.address ="345 any street";
        this.salary = 4500.0;
    }
    
 //parameterised constructer   
public Employee(int eid,String ename, String address, double Salary) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
        this.salary = salary;
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

//

}//main

