import java.io.*;
import java.util.*;
public class maze {

    myQueue q = new myQueue();
	
    char[][] board;
    int maxX;
    int maxY;
    char path='#';
    char wall=' ';
    char me='z';
    char exit='$';
    char visited = '.';
    boolean solved = false;
    Node end; 

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public maze(){
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
    }
    
    public boolean withinBounds(int x, int y){
	return x <= maxX && x >= 0 && y <= maxY && y >= 0;
    }

    public boolean isExit(int x, int y){
	return board[x][y] == exit;
    }
    
    public String toString(){
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public Node solve(int x, int y){
	Node n=new Node(x,y);
	q.enqueue(n);
	Node end = new Node();
	while (!q.empty() && !solved) {
	    delay(50);
	    System.out.println(this);
	    Node current=q.dequeue();
	    char c = current.getChar();
	    int cx=current.getx();
	    int cy=current.gety();
	    if(c < 'Z'){
		c = (char)(c+1);
	    }else {
		c = 'A';
	    }

	    if(withinBounds(cx+1,cy) &&
	       board[cx+1][cy] == path){
		//c = (char)(c+1);
		board[cx+1][cy] = c;
		Node n1=new Node(cx+1,cy,c);
		q.enqueue(n1);
	    } else if(isExit(cx+1,cy)){
		end = new Node(cx+1,cy,'$');
		q.enqueue(end);
		return end;
	    }

	    if (withinBounds(cx-1,cy) &&
		board[cx-1][cy] == path){
		//c = (char)(c+1);
		board[cx-1][cy] = c;
		Node n2=new Node(cx-1,cy,(char)(c+1));
		q.enqueue(n2);
	    }else if(isExit(cx-1,cy)){
		end = new Node(cx-1,cy,'$');
		q.enqueue(end);
		return end;
	    }

	    if(withinBounds(cx,cy+1) &&
	       board[cx][cy+1] == path){
		//c = (char)(c+1);
		board[cx][cy+1] = c;
		Node n3=new Node(cx,cy+1,(char)(c+1));
		q.enqueue(n3);
	    }else if(isExit(cx,cy+1)){
		end = new Node(cx,cy+1,'$');
		q.enqueue(end);
		return end;
	    }

	    if(withinBounds(cx,cy-1) &&
	       board[cx][cy-1] == path){
		//c = (char)(c+1);
		board[cx][cy-1] = c;
		Node n4=new Node(cx,cy-1,(char)(c+1));
		q.enqueue(n4);
	    }else if(isExit(cx,cy-1)){
		end = new Node(cx,cy-1,'$');
	        q.enqueue(end);
		return end;
	    }

	}
	System.out.println(this);
	return end;
    }
}
