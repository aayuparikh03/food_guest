@FunctionalInterface
interface Abc
{
    public void AriOp(int a,int b);
}
public class LamdaVoid {
    public static void main(String args[])
    {
        Abc x=(int i,int j)->
        {
          System.out.println(i+j);
          System.out.println(i-j);
          System.out.println(i*j);
          System.out.println(i/j);
        };
        x.AriOp(10, 5);
    }
    
}
