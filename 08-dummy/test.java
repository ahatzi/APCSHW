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
	for (int i=0;i<1000;i++){
	    L.add(r.nextInt(1000));
	}
	System.out.println(L);
	
	long start = System.currentTimeMillis();
	
	Integer mySum = new Integer(0);
        for (int i=0;i<1000;i++){
	    mySum += L.get(i);
	}
	System.out.println(mySum);
	
	long end = System.currentTimeMillis();
	System.out.println(end-start);

	long java = System.currentTimeMillis();

	int theirSum = 0;
	for (int i=0;i<1000;i++){
	    theirSum += a.get(i);
	}
	System.out.println(theirSum);

	long javaEnd = System.currentTimeMillis();
	System.out.println(javaEnd-java);
    }
}
