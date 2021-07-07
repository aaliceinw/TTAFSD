
package com.tta.codecoverage;


public class Message {
    
    public String getMsg(String msg)
    {
        String name = msg;
        if(name== null || name.length()==0 || name=="")
        {
            name = "Wrong input";
        }
        else
        {
            name = "Hello "+msg;
        }
        
        return name;
    }
    
    
}
