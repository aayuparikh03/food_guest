import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import java.util.*;

public class inj {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            
            Statement st=cn.createStatement();
            
            System.out.println("Enter id:");
            String id=sc.nextLine();
            
            ResultSet rs=st.executeQuery("select number from telephone where id="+id);
            
            ResultSetMetaData md=rs.getMetaData();
            int col=md.getColumnCount();
            
            while(rs.next())
            {
                for(int i=1;i<=col;i++)
                {
                    System.out.printf(rs.getString(i));
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
