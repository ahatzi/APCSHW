import java.io.*;
import java.util.*;

public class DriverArray{
    public static void main(String[] args){
	Random r = new Random();
	myStackArray stack = new myStackArray();
	System.out.println("Stack empty? " + stack.empty());
	for (int i = 0;i<10;i++){
	    int n = r.nextInt(10);
	    stack.push(n);
	    System.out.println(n);
	}
	System.out.println("top element: " + stack.top());
    }
}
