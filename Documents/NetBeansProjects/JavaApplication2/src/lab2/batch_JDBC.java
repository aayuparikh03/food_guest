/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class batch_JDBC {
        static Connection cn;
       static PreparedStatement ps;
       static ResultSet rs;
    public static void main(String args[]) 
    {
        
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            String q="Insert into telephone values(?,?,4214727)";
            ps=cn.prepareStatement(q);
            cn.setAutoCommit(false);
            int id[]=new int[3];
            
            String n[]=new String[3];
           // int num[]=new int[3];
            
            Scanner sc=new Scanner(System.in);
            
            for(int i=0;i<3;i++)
            {
                System.out.println("enter id:");
                id[i]=Integer.parseInt(sc.nextLine());
                System.out.println("enter name:");
                n[i]=sc.nextLine();
               // num[i]=Integer.parseInt(sc.nextLine());
                
            }
            
            for(int i=0;i<3;i++)
            {
                ps.setInt(1, id[i]);
                ps.setString(2, n[i]);
                //ps.setInt(3, num[i]);
                ps.addBatch();
                
            }
            ps.executeBatch();
            cn.commit();
            
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                
    }
    
}
