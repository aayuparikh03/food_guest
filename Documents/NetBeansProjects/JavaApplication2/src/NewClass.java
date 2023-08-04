/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
@FunctionalInterface
interface Calc
{
    public int ope(int a,int b);
}
public class NewClass {
    public static void main(String args[])
    {
        Calc add=(int a,int b)->
        {
            System.out.println(a+b);
            return 0;
        };
        Calc sub=(int a,int b)->
        {
          System.out.println(a-b);
          return 0;
        };
        Calc mul=(int a,int b)->
        {
          System.out.println(a*b);
          return 0;
        };
        Calc div=(int a,int b)->
        {
            System.out.println(a/b);
            return 0;
        };
        
        add.ope(2,3);
        sub.ope(2,3);
        mul.ope(2,3);
        div.ope(4,2);
    }
}