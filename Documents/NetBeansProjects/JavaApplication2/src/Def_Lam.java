/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
interface XYZ
{
    default void print()
    {
        System.out.println("XYZ");
    }
}
interface ABC
{
  
    default void print()
    {
        System.out.println("ABC");
    }
}
class Def implements XYZ,ABC {
 
 
        
        public void print()
        {
            XYZ.super.print();
            ABC.super.print();
        }
    
      
}
public class Def_Lam  
{
    public static void main (String[] args) {
        XYZ x=new Def();
        x.print();
    }
}

