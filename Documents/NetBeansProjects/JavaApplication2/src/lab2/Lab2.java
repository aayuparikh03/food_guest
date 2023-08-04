package lab2;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Lab2 extends Frame implements ActionListener{
    Label L1 = new Label("SID");
    Label L2 = new Label("Name");
    Label L3 = new Label("All Info");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button b = new Button("enter");
    public Lab2()
    {
           setVisible(true);
           setSize(500,500);
           add(L1);
           add(t1);
           add(L2);
           add(t2);
           add(L3);
           add(t3);
           add(b);
           addWindowListener(new WindowAdapter()
           {
               public void windowClosing(WindowEvent e)
               {
                   System.exit(0);
               }
           });
           setLayout(new GridLayout(5,2));
           b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        boolean found = false;
        String id = t1.getText();
        String name = t2.getText();
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from std");
            
            while(rs.next())
            {
                if(id.equals(rs.getString(1)) && name.equals(rs.getString(2)))
                {
                    found = true;
                    if(e.getSource()==b)
                    {
                        
                    t3.setText(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                    }
                }
            }
            con.close();
            stmt.close();
            if(!found)
            {
                t3.setText("not found");
            }
        }
        
        catch(ClassNotFoundException | SQLException f)
        {
                f.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
       Lab2 a = new Lab2();
        
    }
    
}