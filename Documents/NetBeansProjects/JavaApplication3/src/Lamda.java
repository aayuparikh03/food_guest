@FunctionalInterface
interface A
{
   abstract public int add(int a,int b);
}
 class Lamda
{
    public static void main(String args[])
    {
        A a=(int i,int j)->
        {
          return (i+j);  
        };
        A b=(int i,int j)->
        {
          return (i-j);  
        };
        A c=(int i,int j)->
        {
          return (i*j);  
        };
        A d=(int i,int j)->
        {
          return (i/j);  
        };
        int sum=a.add(2, 5);
        int sub=b.add(5,2);
        int mul=c.add(3,4);
        int div=d.add(10,5);
        System.out.println("Sum="+sum);
        System.out.println("Sub="+sub);
        System.out.println("Mul="+mul);
        System.out.println("Div="+div);
    }
}