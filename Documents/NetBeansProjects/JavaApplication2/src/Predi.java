
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Predi {
    public static int totalNum(List <Integer> num,Predicate <Integer> selector)
    {
        int r=0;
        for(int no:num)
        {
            if(selector.test(no))
            {
                r=r+no;
            }
        }
        return r;
    }
    public static void main(String args[])
    {
        List <Integer> l=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Total"+totalNum(l,no->true));
        System.out.println("Total of even:"+totalNum(l,no->no%2==0));
        System.out.println("Total of odd:"+totalNum(l,no->no%2!=0));
        
        
    }
}

