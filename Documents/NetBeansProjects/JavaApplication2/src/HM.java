/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 * 
 */
import java.util.HashMap;
import java.util.Map;
public class HM {
    
    public static void main(String args[])
    {
        String sname;
        int id;
        
        Map<Integer,String> std=new HashMap<>();
        std.put(1,"Aryan");
        std.put(2,"Aayu");
        std.put(3,"Harsh");
        
        for(int i=1;i<=4;i++)
        {
            sname=std.get(i);
            
            if(sname!=null)
            {
                System.out.println("ID:"+i+" Name: "+sname);
            }
            else
            {
                System.out.println("No such student with id: "+i);
            }
            
            
        }
    }
}
