
import java.sql.*;
import java.util.*;


public class P9 {

    static Connection con;
    static PreparedStatement ps;

    public static void main(String[] args) {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String q = "INSERT INTO Family VALUES (?, ?, ?)";
            ps = con.prepareStatement(q);
            con.setAutoCommit(false);
            int[] idi = new int[3];
            String[] n = new String[3];
            String[] c = new String[3];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter ID for family member " + (i + 1) + ": ");
                idi[i] = Integer.parseInt(sc.nextLine()); // Change this line
                System.out.print("Enter name for family member " + (i + 1) + ": ");
                n[i] = sc.nextLine();
                System.out.print("Enter city for family member " + (i + 1) + ": ");
                c[i] = sc.nextLine();
            }
            for (int i = 0; i < 3; i++) {
                ps.setInt(1, idi[i]);
                ps.setString(2, n[i]);
                ps.setString(3, c[i]);
                ps.addBatch();
            }
            ps.executeBatch();
            con.commit();
            con.close();
            ps.close();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
               ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}