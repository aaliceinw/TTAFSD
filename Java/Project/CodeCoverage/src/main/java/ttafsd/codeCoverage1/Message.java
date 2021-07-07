
package ttafsd.codeCoverage1;


public class Message {
    
    public String getMsg(String msg)
    {
        if(msg== null || msg.length()==0)
        {
            return "Wrong input";
        }
        
        return "Hello "+msg;
    }
  
    
}
