import java.util.*;

class valid
{
    public static void main(String args[])
    {
        List li = new ArrayList(10);
        li.add("Hello");
        li.add(new Integer(108));

        //String in = (String)li.iterator().next();
        Iterator i = li.iterator();
        Object obj = i.next();
        String item = null;
        if(obj instanceof String)
        {
            item = (String)obj;
        }
    }
}