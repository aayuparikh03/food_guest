/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List.*;
import java.util.List;


public class AL {
    
    public static void main(String args[])
    {
        List l=(List) new ArrayList();
        l.add("Sun");
        l.add(1);
        l.add("Hii");
        l.add("How are you?");
        
        
        for(int i=0;i<4;i++)
        {
            System.out.println("Value:"+l.get(i)+"  Type:"+l.get(i).getClass().getName());
        }
        
        
    }
}
