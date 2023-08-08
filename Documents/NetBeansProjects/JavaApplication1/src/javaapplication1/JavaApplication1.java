/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author Lenovo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            System.out.println(" Connect with db server");
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select * from telephone");
            
            while(rs.next()){
            System.out.println("Name is "+ rs.getString(1));    
            }
            
            cn.close();
            st.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
