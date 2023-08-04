/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class Trans_man {
    public static void main(String args[])
    {
        Statement st;
        Connection cn;
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            cn.setAutoCommit(false);
            
             st=cn.createStatement();
             
             st.executeUpdate("insert into telephone values(6,'Faru',7016930858)");
             
             cn.commit();
             cn.close();
             
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
