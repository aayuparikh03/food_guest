/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**N
 *
 * @author Lenovo
 */
public class SRS_Revise {

    
    public static void main(String[] args){
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("Select * from telephone");
            
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            st.close();
            cn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}