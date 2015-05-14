import java.io.*;
import java.util.*;
public class Heap<E>{
    private ArrayList<E> a;
    
    public Heap(){
	this(10);
    }
    public Heap(int i){
	a = new ArrayList<E>();
	Random r = new Random();
	for (int j = 0;j<i;j++){
	    a.add(r.nextInt(100));
	}
    }

    public E findMin(){
	return a.get(0);
    }

    public void removeMin(){
	E min = a.get(0);
	E swap = a.get(a.length-1);
	a.set(0,swap);
	pushDown();
    }
}
