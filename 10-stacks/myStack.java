public class myStack<E>{
    private Node<E> l;
    
    public myStack(){
	l = null;
    }

    public myStack(E s){
	Node<E> tmp = new Node<E>(s);
	l = tmp;
    }
    
    public void push(E data){
	Node<E> tmp = new Node<E>(data);
	tmp.setNext(l);
	l = tmp;
    }

    public E pop(){
	E data = l.getData();
	l = l.getNext();
	return data;
    }

    public boolean empty(){
	return (l == null);
    }

    public E top(){
	return l.getData();
    }
}
