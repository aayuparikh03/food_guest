@FunctionalInterface
 interface A
{
    abstract int add(int x,int y);
             
    
}
public abstract class FuncExp implements A
{
    public static void main(String args[])
    {
        int d=2,c=3;
        
        
        
        A p=(int a,int b)-> {
            return a + b;
            
        };
       int m= p.add(d,c);
       System.out.println(m);
     
    }
}