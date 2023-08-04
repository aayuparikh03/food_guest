/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class PQ
{
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue();
               
		q.add("Khushi");
		q.add("Paras");
		q.add("Biren");
		q.add("Ranjan");
		System.out.println(q.remove());
                System.out.println(q.remove());
                System.out.println(q.remove());
                System.out.println(q.remove());
	}
}