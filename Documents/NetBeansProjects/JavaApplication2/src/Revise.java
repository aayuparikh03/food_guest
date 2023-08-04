
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class Number
{
    private int num;
    
    public Number(int num)
    {
           this.num=num;
    }
    public int toInt()
    {
        return num;
    }
}
public class Revise
{
    public static void main(String args[])
    {
        Set <Number> s=new HashSet<>();
        
        s.add(new Number(1));
        s.add(new Number(2));
        s.add(new Number(19));
        s.add(new Number(22));
        System.out.println("Before remove:"+s);
        
        //Collections.sort(s);
    }
}