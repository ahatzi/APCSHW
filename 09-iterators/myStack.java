public class myStack{
    private Node<E> l;
    public myStack(){
	l = null;
    }
    public myStack(E s){
	Node<E> tmp = new Node<E>(s);
	l = null;
	l.setNext(tmp);
    }
    public void push(E s){
	Node<E> tmp = new Node<E>(s);
	
    }
}
