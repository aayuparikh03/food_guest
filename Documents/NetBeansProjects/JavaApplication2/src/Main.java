/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
interface Z
{
    default void print()
    {
        System.out.println("XYZ");
    }
}
interface C
{
    
    default void print()
    {
        System.out.println("ABC");
    }
}
class Def implements Z,C {
 
 
        
        public void print()
        {
            Z.super.print();
            C.super.print();
        }
    
      
}
public class Main 
{
    public static void main (String[] args) {
        XYZ x=new Def();
        x.print();
    }
}