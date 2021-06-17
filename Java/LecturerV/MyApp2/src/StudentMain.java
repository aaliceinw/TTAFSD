
public class StudentMain {
    public static void main(String[] args) {
        
        StudentQuery obj = new StudentQuery();
        
        //1. display all data
        obj.display();
        
        //2. delete record
        int delete = obj.delete(113);
        if(delete == 1)
        {
            System.out.println("row deleted succesfully;");
        }
        else
        {
            System.out.println("Can not delete. Id could not match");
        }
        
        
        //3. display all data after delete
        obj.display();
       
    }
}
