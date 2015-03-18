public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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

    public String find(int n){
	Node l2 = l;
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext;
	    l2 = l3;
	}
	return l2.getData();
    }

    public void insert(int n, String s){
        Node l2 = l;
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext;
	    l2 = l3;
	}
	l2.setData(s);
    }
}
