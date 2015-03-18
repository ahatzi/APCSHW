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
	while (n>0){
	    l.getNext.find(n-1)
	}
	return l.getData();
    }

    public void insert(int n, String s){
	while (n>0){
	    l.getNext.find(n-1)
	}
	return l.setData(s);
    }
}
