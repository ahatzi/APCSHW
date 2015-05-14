import java.io.*;
import java.util.*;
public class Heap{
    private ArrayList<Integer> a;
    
    public Heap(){
	this(10);
    }
    public Heap(int i){
	a = new ArrayList<Integer>();
	Random r = new Random();
	for (int j = 0;j<i;j++){
	    a.add(r.nextInt(100));
	}
    }

    public int findMin(){
	return a.get(0);
    }

    public void pushDown(int n){
	int next = -1;
	if ((2*n+1) >= a.size()){
	    return;
	}
	else{
	    if ((a.get(n) < getLeft(n)) && (a.get(n) < getRight(n))){
		if (getLeft(n) > getRight(n)){
		    int first = a.get(n);
		    int second = getLeft(n);
		    a.set(n,second);
		    a.set(2*n+1,first);
		    next = 2*n+1;
		}
		else{
		    int first = a.get(n);
		    int second = getRight(n);
		    a.set(n,second);
		    a.set(2*n+2,first);
		    next = 2*n+2;
		}
	    }
	    else if (a.get(n) < getLeft(n)){
		int first = a.get(n);
		int second = getLeft(n);
		a.set(n,second);
		a.set(2*n+1,first);
		next = 2*n+1;
	    }
	    else if (a.get(n) < getRight(n)){
		int first = a.get(n);
		int second = getRight(n);
		a.set(n,second);
		a.set(2*n+2,first);
		next = 2*n+2;
	    }
	}
	if (n > -1){
	    pushDown(next);
	}
    }

    public int getLeft(int n){
	return a.get(2*n+1);
    }
    
    public int getRight(int n){
	return a.get(2*n+2);
    }

    public void removeMin(){
	int min = a.get(0);
	int swap = a.get(a.size()-1);
	a.set(0,swap);
	pushDown(0);
    }
}
