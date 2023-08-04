
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Hset {
    public static void main(String args[])
    {
        Set<String> stud=new HashSet<>();
        stud.add("Aryan");
        stud.add("Aryan");
        stud.add("Aayu");
        stud.add("Parag");
        stud.add("Harsh");
        stud.add("Raxita");
        stud.add("Aayu");
        //System.out.println(stud.add("Aryan"));
        System.out.println(stud);
        
        stud.remove("Aayu");//Remove particular element
        System.out.println(stud);
        System.out.println(stud.size());//shows size
        
        stud.clear();//Clears all element
        System.out.println(stud);
    }
}
