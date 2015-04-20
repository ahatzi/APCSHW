import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	for (int i=0;i<l.size();i++){
	    if (n.getPriority() <= l.get(i).getPriority()){
		l.add(i,n);
		break;
	    }
	}
	l.add(n);
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










