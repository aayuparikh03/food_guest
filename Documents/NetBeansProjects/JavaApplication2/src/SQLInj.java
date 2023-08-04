
import java.sql.*;
import java.sql.Statement.*;
import java.sql.DriverManager;
import java.util.*;
public class SQLInj 
{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        
        Statement st = con.createStatement();
        System.out.println("Enter zip: ");
        String zip = sc.nextLine();
        System.out.println("Enter id:");
        int id = sc.nextInt();
        ResultSet rs = st.executeQuery("select * from APP.customer where zip='"+zip+"' and customer_id="+id);
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