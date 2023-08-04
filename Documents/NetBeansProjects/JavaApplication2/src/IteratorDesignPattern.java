
import java.util.Iterator;

public class IteratorDesignPattern 
{
    public static void main(String args[])
    {
        NameRepository name=new NameRepository();
        
        Iterator itr=name.getIterator();
        
        while(itr.hasNext())
        {
            String n=(String)itr.next();
            System.out.println("Name:"+n);
        }
    }
}