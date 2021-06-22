//Student object
public class SMain {
    public static void main(String[] args) 
    {
        //object using default const. 
        Student s1 = new Student();//-1 NA -1.0
        
        System.out.println("Student 1");
        
        s1.setSid(101);
        s1.setSname("V");
        s1.setScore(70.0);
        System.out.println("ID :"+s1.getSid());
        System.out.println("NAME :"+s1.getSname());
        System.out.println("SCORE :"+s1.getScore());
        
        System.out.println("=================================");
        
        Student s2 = new Student();
        
        s2.setSid(102);
        s2.setSname("Joan");
        s2.setScore(75.0);
        System.out.println("Student 2");
        System.out.println("ID :"+s2.getSid());
        System.out.println("NAME :"+s2.getSname());
        System.out.println("SCORE :"+s2.getScore());
        
        System.out.println("=================================");
        
        Student s3 = new Student(103 , "Paul" , 80.0);
        
        System.out.println("Student 3");
        System.out.println("ID :"+s3.getSid());
        System.out.println("NAME :"+s3.getSname());
        System.out.println("SCORE :"+s3.getScore());
        
    }
}