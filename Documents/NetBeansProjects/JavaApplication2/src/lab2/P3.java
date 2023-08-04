
import java.sql.*;

public class P3 {

    
    public static void main(String[] args) {
       
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            Statement st=cn.createStatement();
//           String s = "Insert into Family Values(1,'Khushi','Godhra')";
//          
//           st.executeUpdate(s);
            st.executeUpdate("Insert into Family Values(3,'Paras','Godhra')");
            cn.close();
            st.close();
        }
        catch(ClassNotFoundException e)
        {}
        catch(SQLException f){}
        catch(Exception g){}
        
    }
    
}