
import java.util.ArrayList;
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
public class IDP {
    public static void main(String args[])
    {
        List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        System.out.println("Access Number using Lamba in iterator::");
        System.out.println("Numbers are:");
        l.forEach(n->System.out.println(n+ " "));
        System.out.println(" ");
    }
    
}
