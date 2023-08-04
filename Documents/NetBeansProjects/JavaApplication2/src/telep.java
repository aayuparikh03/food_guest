import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Statement;
import java.sql.DriverManager;

public class telep extends Frame implements ActionListener{
    Label l1=new Label("Name:");
    TextField t1=new TextField();
    Label l2=new Label("Mobile Number here:");
    TextField t3=new TextField();
    Button b=new Button("Enter");
    
    
    public telep()
    {
        setSize(500,500);                            
        setVisible(true);
        add(l1);
        add(t1);
        add(l2);
        add(t3);
        add(b);
        
         addWindowListener(new WindowAdapter()
           {
               @Override
               public void windowClosing(WindowEvent e)
               {
                   System.exit(0);
               }
           });
        setLayout(new GridLayout(4,2));
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        boolean found=false;
        String n=t1.getText();
        
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection cn=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from app.telephone");
            
            
            while(rs.next())
            {
                if(n.equals(rs.getString(2)))
                {
                    found=true;
                    if(e.getSource()==b)
                    {
                        t3.setText(rs.getString(3));
                        t3.setEditable(false);
                        
                    }
                }             
         
            }
            cn.close();
            st.close();
            if(!found)
            {
                t3.setText("No user found");
                 t3.setEditable(false);
            }
            
        }
        catch(ClassNotFoundException | SQLException f )
        {
            f.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        telep t=new telep();
    }
}
