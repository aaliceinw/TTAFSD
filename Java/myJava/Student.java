//Student bean | Student Class | Student POJO
//getter and setter - constructor

public class Student {
    
    //1. Properties -> variable
    int sid;
    String sname;
    double score;
    
    /*
    //default const.
    public ClassName()
    {
        
    }
    
    //parameterized const.
    public ClassName(parameter)
    {
    
    }
    */

    public Student() {
        /*
        int -> 0
        String -> null
        double -> 0.0
        */
        this.sid = -1;
        this.sname = "NA";
        this.score = -1.0;
                
    }

    public Student(int sid, String sname, double score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    
    
    
    
    //getter and setter
    /*
    setXXX()
    public void setSid(int sid)
    {
        this.sid = sid
    }
    ===============
    getXXX()
    public int getSid()
    {
        return this.sid;
    }
    */  
      

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
