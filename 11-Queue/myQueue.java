public class myQueue{
    private Node<E> head;
    private Node<E> tail;

    public myQueue(){
	head = null;
	tail = null;
    }

    public void enqueue(E data){
	Node<E> node = new Node<E>(data);
	if (empty()) {
	    head = node
	    tail = head;
	} else {
	    head.setNext(node);
	    head = node;
	}
    }

    public E dequeue() {
	E out = tail.getData();
	tail = tail.getNext();
	return out;
    }

    public boolean empty() {
	return head == null;
    }

    public E head() {
	return head.getData();
    }

    public int size() {
	int size = 0;
	for(Node<E> n = tail; n != null; n = n.getNext()) {
	    size++;
	}
	return size;
    }
}
