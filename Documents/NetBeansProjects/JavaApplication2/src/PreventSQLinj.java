
import java.sql.*;
import java.util.*;
public class PreventSQLinj {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
         System.out.println("Enter zip: ");
        String zip = sc.nextLine();
        System.out.println("Enter id:");
        int id = sc.nextInt();
       PreparedStatement st = con.prepareStatement("select * from APP.customer where zip= ? and customer_id= ?");
       st.setString(1,zip);
       st.setInt(2,id);
        ResultSet rs = st.executeQuery();
        ResultSetMetaData rd = rs.getMetaData();
        int cols = rd.getColumnCount();
        while(rs.next())
        {
                for(int i=1;i<=cols;i++)
                {
                        System.out.printf("%10s",rs.getString(i)+"\t");
                }
                System.out.println();
        }
        }
        catch(ClassNotFoundException | SQLException e)
        {
                e.printStackTrace();
        }
    }
    
}