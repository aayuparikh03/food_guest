/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import java.io.*;

/**
 *
 * @author Lenovo
 */
public class Trans_Man_PrepStmt {
    
    public static void main(String args[])
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app","app");
            PreparedStatement ps=cn.prepareStatement("insert into telephone values(?,?,12345789)");
            cn.setAutoCommit(false);
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            while(true)
            {
                System.out.println("Enter ID:");
                String s1=br.readLine();
                int id=Integer.parseInt(s1);
                
              
                
                System.out.println("Enter Name:");
                String name=br.readLine();
                
                ps.setInt(1,id);
                if(id==1)
                {
                    cn.commit();
                }
                ps.setString(2,"abc");
                
                ps.executeUpdate();
               
                
                System.out.println("Commit/Rollback");
                
                String ans=br.readLine();
                
                
                if(ans.equals("commit"))
                {
                    cn.commit();
                }
                if(ans.equals("rollback"))
                {
                    cn.rollback();
                }
                System.out.println("Want to add more records y/n");  
                String an=br.readLine();  
                        if(an.equals("n"))
                        {  
                            break;  
                        }  
            }
            cn.commit();
            System.out.println("Record addded succesfully");
            cn.close();
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
