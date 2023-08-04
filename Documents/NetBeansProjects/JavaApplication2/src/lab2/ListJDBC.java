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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ListJDBC {
    public static void main(String args[])
    {
        List <Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        
        Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            ps=cn.prepareStatement("select * from telephone where id=?");
            
            for(int i=0;i<l.size();i++)
            {
                ps.setInt(1,l.get(i));
            }
            
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                System.out.println(rs.getString("ID")+" "+rs.getString("NAME")+" "+rs.getString(""));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
            
    
}
