/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
interface Vehicle
{
    default void drive()
    {
          System.out.println("Vehicle class");
    }
    

}
interface FourWheel
{
    default void drive()
    {
        System.out.println("Fourwheeler");
    }
}
class Car implements Vehicle,FourWheel
{
    public void drive()
    {
        Vehicle.super.drive();
        FourWheel.super.drive();
    }
        
}
public class Def_Methd {
    public static void main(String args[])
    {
        Vehicle v=new Car();
        v.drive();
        
    }
}
