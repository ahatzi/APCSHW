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

    public int bunnyEars2(int bunnies) {
	if (bunnies == 0){
	    return 0;
	}
	else if (bunnies%2==1){
	    bunnies--;
	    return 2 + bunnyEars2(bunnies);
	}
	else if (bunnies%2==0){
	    bunnies--;
	    return 3 + bunnyEars2(bunnies);
	}
    }
    
    public int strCount(String str, String sub) {
	int i = 0;
	if (str.length() == 0){
	    i = i;
	}
	else if (str.substring(0,sub.length()).equals(sub)){
	    i = 1 + strCount(str.substring(sub.length()), sub);
	}
	return i;
    }

    public int sumDigits(int n) {
	int i = 0;
	if (n == 0){
	    i = i;
	}
	else {
	    i = n%10 + sumDigits(n/10);
	}
	return i;
    }

    public String allStar(String str) {
	String s = "";
	if (str.length() == 0){
	    s = str;
	}
	else if (str.length() == 1){
	    s = str;
	}
	else if (str.length() == 2){
	    s = str.substring(0,1) + "*" + str.substring(1);
	}
	else {
	    s = str.substring(0,1) + "*" + allStar(str.substring(1));
	}
	return s;
    }
}
