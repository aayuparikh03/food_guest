/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Lenovo
 */
public class Pred {
    public static int sum(List <Integer> num,Predicate<Integer>selector)
    {
        int res=0;
        
        for(int no:num)
        {
            if(selector.test(no))
            {
                res=res+no;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        List<Integer>num=Arrays.asList(1,2,3,4);
        System.out.println("Sum:"+sum(num,no->true));
        System.out.println("Sum of odd:"+sum(num,no->no%2==0));
    }
}
