
public class EmployeeMain {
    public static void main(String[] args) {
        
        EmployeeQuery obj = new EmployeeQuery();
        
        obj.display();
        
        int delete = obj.delete(102);
        if(delete ==1)
        {
            System.out.println("row deleted successfully;");
        }
        else
        {
            System.out.println("Cannot delete. Id does not match");
        }
        
        obj.display();
    }
    
}
