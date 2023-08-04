
import java.util.HashSet;
import java.util.Set;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Student
{
    private int id;
    private String name;

    public Student(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public String toString()
    {
        return name;
    }
    public boolean equals(Object ob)
    {
        if(this==ob)
        {
            return true;
        }
        if(ob==null || ob.getClass()!=this.getClass())
        {
          return false;
        }
        Student s=(Student)ob;
        return s.name.equals(this.name);
    }
    public int hashCode()
    {
        return this.id;
    }
     public static void main(String args[])
    {
        Set <Student>s=new HashSet<>();
        System.out.println("Aryan is added??"+s.add(new Student("Aryan",1)));
        s.add(new Student("Aayu",2));
        s.add(new Student("Harsh",3));
        
        System.out.println(s);
    }
    

}
