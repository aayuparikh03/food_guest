
package javaapplication2;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;



public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heres
       // System.out.println("Hello");
        
       try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            System.out.println(" Connect with db server");
            
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery("Select * from app.telephone");
            
            while(rs.next()){
            System.out.println("ID is "+ rs.getString(1)+" Name:"+rs.getString(2));     
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
