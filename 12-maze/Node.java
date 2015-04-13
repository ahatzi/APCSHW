public class Node {
    private int xcor;
    private int ycor;
    private char sym;
    private Node next;
    
    public Node(){
	xcor = 0;
	ycor = 0;
	next = null;
	sym = 'A';
    }
    public Node(int x, int y){
	xcor = x;
	ycor = y;
	next = null;
	sym='A';
    }

    public Node(int x, int y, char c) {
	xcor=x;
	ycor=y;
	sym=c;
	next=null;
    }

    public void setxy(int x, int y){
	xcor = x;
	ycor = y;
    }
    public int  getx(){
	return xcor;
    }
    public int gety(){
	return ycor;
    }
    
    public void setNext(Node n){
	next = n;
    }

    public void setChar(char c) {
	sym=c;
    }
    public char getChar() {
	return sym;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return ""+xcor+","+ycor;
    }

}
