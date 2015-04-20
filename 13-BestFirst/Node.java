
public class Node {
    private int x,y;
    private Node prev;
    private double priority;
		
    public Node(int x, int y, double priority){
	this.x = x;
	this.y = y;
	this.priority = priority;
    }  

    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
		
    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public double getPriority(){
	return priority;
    }
		
}










