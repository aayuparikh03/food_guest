
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PrepStmt {

    public static void main(String args[]) throws SQLException, ClassNotFoundException
    {
            PreparedStatement st;
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            st=cn.prepareStatement("Select * from telephone where id=?");
       
            st.setInt(1,1);
            
       
       
            ResultSetMetaData rs=st.getMetaData();
            
            int ic=rs.getColumnCount();
            String name=rs.getColumnName(2);
            for(int i=1;i<ic;i++)
            {
                System.out.println("Column:"+rs.getColumnName(i));
                System.out.println("Column Type" + rs.getColumnType(i));
                System.out.println("Display Size: " +rs.getColumnDisplaySize(i) );
                System.out.println("Precision: " + rs.getPrecision(i));
               System.out.println("Data:"+rs.getString("name"));
                
                
                
                
            }


           
//             st=cn.prepareStatement("Update telephone set name='aayu' where id=?");
//            st.setInt(1,1);
//            st.execute();
//            System.out.println("Updated");
//
//            st=cn.prepareStatement("Delete from telephone where id=?");
//            st.setInt(1,5);
//
//            st.execute();
//            System.out.println("Deleted");
        }
        
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
    }
}
