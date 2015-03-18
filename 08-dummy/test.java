import java.io.*;
import java.util.*;
public class test{
    public static void main(String[] args){
	Random r = new Random();

	ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1000;i>0;i--){
	    a.add(r.nextInt(1000));
	}

	LList L = new LList();
	for (int i=1000;i>0;i--){
	    L.add(r.nextInt);
	}
	
	start = System.currentTimeMillis();
	
	int mySum = 0;
        for (int i=0;i<1000;i++){
	    mySum += L.get(i);
	}

	end = System.currentTimeMillis();
	System.out.println(end-start);

	java = System.currentTimeMillis();

	int theirSum = 0;
	for (int i=0;i<1000;i++){
	    theirSum += a.get(i);
	}

	javaEnd = System.currentTimeMillis();
	System.out.println(javaEnd-java);
    }
}
