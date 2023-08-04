
import java.util.HashSet;
import java.util.Set;

class Student
{
    private String name;
    public Student(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return name;
    }
    
}
public class HashDup {
    public static void main(String args[])
    {
        Set<Student> std=new HashSet<>();
        std.add(new Student("Aryan"));
        std.add(new Student("Aryan"));
        std.add(new Student("Harsh"));
        std.add(new Student("Aayu"));
        System.out.println("Aryan added::"+std.add(new Student("Aayu")));
        
        System.out.println(std);
        std.remove("Harsh");
         System.out.println(std);
         std.add(new Student("Aayu"));
          System.out.println(std);
    }
}
