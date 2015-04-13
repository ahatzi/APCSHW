public class myQueue{
    Node first;
    Node last;
    int length;
    
    public myQueue(){
	first = null;
	last = null;
    }

    public void enqueue(Node n){
	if(first != null){
	    last.setNext(n);
	}else {
	    first = n;	
	}
	
	last = n;
	length++;
    }

    public Node dequeue(){
	if(empty()){
	    return null;
	}
	Node tmp = first;
	first = first.getNext();
	length--;
	if(first == null){
	    last = null;
	}
	return tmp;
    }

    public boolean empty(){	
	return first == null;
    }

    public Node head(){
	if(empty()){
	    return null;
	}
	return first;
    }

    public String toString(){
	String s = "";
	Node tmp = first;
	for (int i = 0; i<length; i++){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }

}
