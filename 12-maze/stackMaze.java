public class stackMaze extends maze{
    private myStack s = new myStack();

    public stackMaze(){
	super();
    }


    public Node solve(int x, int y){
	Node n=new Node(x,y);
	s.push(n);
	Node end = new Node();
	while (!s.empty() && !solved) {
	    delay(50);
	    System.out.println(this);
	    Node current=s.pop();
	    char c = current.getChar();
	    int cx=current.getx();
	    int cy=current.gety();
	    if(c >= 'Z'){
		c = 'A';
	    }else {	
		c = (char)(c+1);
	    }
	    if(withinBounds(cx+1,cy) &&
	       board[cx+1][cy] == path){
		//c = (char)(c+1);
		board[cx+1][cy] = c;
		Node n1=new Node(cx+1,cy,c);
		s.push(n1);
	    } else if(isExit(cx+1,cy)){
		end = new Node(cx+1,cy,'$');
		return end;
	    }

	    if (withinBounds(cx-1,cy) &&
		board[cx-1][cy] == path){
		//c = (char)(c+1);
		board[cx-1][cy] = c;
		Node n2=new Node(cx-1,cy,(char)(c+1));
		s.push(n2);
	    }else if(isExit(cx-1,cy)){
		end = new Node(cx-1,cy,'$');
		return end;
	    }

	    if(withinBounds(cx,cy+1) &&
	       board[cx][cy+1] == path){
		//c = (char)(c+1);
		board[cx][cy+1] = c;
		Node n3=new Node(cx,cy+1,(char)(c+1));
		s.push(n3);
	    }else if(isExit(cx,cy+1)){
		end = new Node(cx,cy+1,'$');
		return end;
	    }

	    if(withinBounds(cx,cy-1) &&
	       board[cx][cy-1] == path){
		//c = (char)(c+1);
		board[cx][cy-1] = c;
		Node n4=new Node(cx,cy-1,(char)(c+1));
		s.push(n4);
	    }else if(isExit(cx,cy-1)){
		end = new Node(cx,cy-1,'$');
		return end;
	    }

	}
	System.out.println(this);
	return end;
    }

}
