public class Recursion{
    public int fib(int i){
	if (i < 2){
	    return 1;
	}
	else {
	    return fib(i-1) + fib(i-2);
	}
    }
   
    public int length(String s){
	if (s.equals("")){
	    return 0;
	}
	else{
	    return 1 + length(s.substring(1));
	}
    }
    
    public int countX(String s){
	if (s.equals("")){
	    return 0;
	}
	else if (s.substring(0,1).equals("x")){
	    return 1 + countX(s.substring(1));
	}
	else{
	    return countX(s.substring(1));
	}
    }
}
