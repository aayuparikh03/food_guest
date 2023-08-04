
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class QuEx {
    public static void main(String args[])
    {
        Queue<String> q=new PriorityQueue();
        q.add("ARYAN");
        q.add("ARYAn");
        q.add("AAyu");
      // if here we put poll then it is showing exception    q.poll();
        
        for(int i=1;i<=3;i++)
        {
            //System.out.println("Value of "+i+" is: "+q.poll());
            System.out.println("Value of "+i+" is: "+q.remove());
          //  System.out.println("Value of "+i+" is: "+q.poll());
        }
        q.poll();
}
}