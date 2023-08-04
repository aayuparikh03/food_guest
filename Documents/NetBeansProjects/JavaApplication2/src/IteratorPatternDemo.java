
import java.util.Iterator;

/**
 *
 * @author Lenovo
 */
public interface Container {

	public Iterator getIterator();
	
}







public class CollectionofNames implements Container {

	 public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	
	 public int age[]={26, 25,24,25,23}; 
		
	 public String address[]={"New Delhi", "Gaziabad","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	 
	 public String designation[]={"Java Programmer and Content Writer", "CEO","Programmer and Web Designer","Manager",".Net Trainer"};
		
	
	@Override
	public Iterator getIterator() {
		
		return new CollectionofNamesIterate() ;
	}
	
	
	private class CollectionofNamesIterate implements Iterator{
		
		int i;

		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	
	}
}



public class IteratorPatternDemo {
	
	public static void main(String[] args) {
	      CollectionofNames cmpnyRepository = new CollectionofNames();
	      
	      for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}
