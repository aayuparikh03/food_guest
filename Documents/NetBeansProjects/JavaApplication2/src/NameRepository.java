import java.util.Iterator;

public class NameRepository {
    public String names[]={"Aryan","Aayu","Parag","Harsh","Raxita"};
    public Iterator getIterator()
    {
        
    
        return new NameIterator();
    
    }
    private class NameIterator implements Iterator
    {
        int i=0;
        public boolean hasNext()
        {
            if(i<names.length)
            {
                return true;
                
                   
            }
            return false;
        }       
        public Object next()
        {
            if(this.hasNext())
            {
                return names[i++];
            }
            return null;
        }
    
    
    }
}
