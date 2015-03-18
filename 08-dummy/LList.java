public class LList {
    private Node l=new Node(null);
    private int len = 0;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public String get(int n){
	Node l2 = l;
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext();
	    l2 = l3;
	}
	return l2.getData();
    }

    public void add(int n, String s){
	Node a = new Node(s);
	Node l2 = l;
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext();
	    l2 = l3;
	}
	a.setNext(l2.getNext());
	l2.setNext(a);
	l = l2;
	len++;
    }

    public void remove(int n){
	Node l2 = l;
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext();
	    l2 = l3;
	}
	l2.setNext(l2.getNext().getNext());
	l = l2;
	len--;
    }
}
