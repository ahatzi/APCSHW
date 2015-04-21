
public class Node {
    private int x,y;
    private Node prev;
    private double priority;
    //private int steps;
		
    public Node(int x, int y, double priority){
	this.x = x;
	this.y = y;
	this.priority = priority;
	//this.steps = steps;
    }  

    /*
    public int getSteps(){
	return steps;
    }
    */
    
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










