
import java.sql.*;
public class P7 {

    
    public static void main(String[] args) {
       Connection con;
       CallableStatement cn;
       try{
           
           Class.forName("org.postgresql.Driver");
           con = DriverManager.getConnection("jdbc:postrgresql://localhost:5432/postgres","postgres","postgres");
           cn = con.prepareCall("{? =call facto(?)}");
           cn.setInt(2,5);
            //ResultSet rs = cn.executeQuery();
           cn.registerOutParameter(1,Types.INTEGER);
           cn.execute();
               System.out.println(cn.getInt(1));
          
       }
       catch(Exception e){}
    }
    
}