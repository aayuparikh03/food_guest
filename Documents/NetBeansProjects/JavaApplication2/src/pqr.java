@FunctionalInterface
 interface Abc
{
    abstract int add(int x,int y);
             
    
}
public class pqr implements Abc
        
{
    public static void main(String args[])
    {
        int d=2,c=3;
        
        
        
        Abc p=(int a,int b)-> {
            return a + b;
            
        };
       int m= p.add(d,c);
       System.out.println(m);
     
    }

  
}