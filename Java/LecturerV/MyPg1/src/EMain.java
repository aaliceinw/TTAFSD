

public class EMain {
     
        public static void main(String[] args) {
              //object using default const. 
       
        
        Employee e1 = new Employee();
        System.out.println("Employee 1");
        
        e1.setEid(101);
        e1.setEname("Bob");
        e1.setAddress("123 Any Where");
        e1.setSalary(3000.0);
        System.out.println("ID :"+e1.getEid());
        System.out.println("NAME :"+e1.getEname());
        System.out.println("ADDRESS :"+e1.getAddress());
        System.out.println("SALARY :"+e1.getSalary());
        
        System.out.println("=================================");
        
        
        Employee e2 = new Employee();
        
        System.out.println("Employee 2");
        
        e2.setEid(102);
        e2.setEname("Lily");
        e2.setAddress("456 Any Where");
        e2.setSalary(4000);
        System.out.println("ID :"+e2.getEid());
        System.out.println("NAME :"+e2.getEname());
        System.out.println("ADDRESS :"+e2.getAddress());
        System.out.println("SALARY :"+e2.getSalary());
        
        System.out.println("=================================");
        
        
        Employee e3 = new Employee();
        
        System.out.println("Employee 3");
        
        e3.setEid(103);
        e3.setEname("Nthabi");
        e3.setAddress("789 Any Where");
        e3.setSalary(3500);
        System.out.println("ID :"+e3.getEid());
        System.out.println("NAME :"+e3.getEname());
        System.out.println("ADDRESS :"+e3.getAddress());
        System.out.println("SALARY :"+e3.getSalary());
        
        System.out.println("=================================");
    }//object end
}//main end
