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
public class CRUD {
    public static void main(String args[])
    {
        try
        {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st=cn.createStatement();
//    (create table)        String query="CREATE TABLE FAM"+"(ID NUMERIC(5) NOT NULL,"+"NAME VARCHAR(20),"+"CITY VARCHAR(10),"+"PRIMARY KEY(ID))";
//            int i=st.executeUpdate(query);
//            



//(Insert into table)        String ins="INSERT INTO FAM VALUES(2,'Aayu','GDR')";
//              
//             int j=st.executeUpdate(ins);
//           
//               String ins2="INSERT INTO FAM VALUES(3,'jadi','GDR')";
//               int k=st.executeUpdate(ins2);
//               
               
               
//(To delete)          String delete="DELETE FROM FAM WHERE ID=2 ";
//               int q=st.executeUpdate(delete);
           }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
