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

/**
 *
 * @author Lenovo
 */
public class Tele_Dir {
    
    public static void main(String args[])
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps=cn.prepareStatement("Select name from telephone where id=?");
            ps.setInt(1,1);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
