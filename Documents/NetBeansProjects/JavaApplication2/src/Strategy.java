
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Strategy {
    public static void main(String args[])
    {
        List <Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Total of numbers is:"+total(num));
        System.out.println("Total of numbers is:"+totaleven(num));
         System.out.println("Total of numbers is:"+totalodd(num));
        
    }
    public static int total(List <Integer> num)
    {
        int r=0;
        
        for(int no:num)
        {
            r=r+no;
        }
        return r;
    }
    public static int totaleven(List <Integer> num)
    {
        int rs=0;
        
        for(int no:num)
        {
            if(no%2==0)
            {
                rs=rs+no;
            }
        }
        return rs;
    }
     public static int totalodd(List <Integer> num)
    {
        int rs=0;
        
        for(int no:num)
        {
            if(no%2!=0)
            {
                rs=rs+no;
            }
        }
        return rs;
    }
}
