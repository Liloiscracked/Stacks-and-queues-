import java.util.ArrayList;

public class LabStack<T> {
    ArrayList<T> pool; 
    
    public LabStack() {
      pool = new ArrayList<T>();
    }
    
       
    public void clear() {
        pool.clear();
    }
    
    public boolean isEmpty() {
        return pool.isEmpty();
    }
    
    public T topEl() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        return pool.get(pool.size()-1);
    }
    
    public T pop() {
        if (isEmpty())
            throw new java.util.EmptyStackException();
        return pool.remove(pool.size()-1);
    }
    
    public void push(T el) {
        pool.add(el);
    }
    
    public String toString() {
        return pool.toString();
    }
    public void reverse(){
        LabStack s2 = new LabStack();
        LabStack s3 = new LabStack();
        while(!this.isEmpty())
            s2.push(this.pop());
        while(!s2.isEmpty())
            s3.push(s2.pop());
        while(!s3.isEmpty())
            this.push((T) s3.pop());
    }
}
