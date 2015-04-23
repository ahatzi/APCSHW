public class binaryTree<E extends Comparable<E>>{
    private Node<E> root = null;
    
    public binaryTree<E>(E data){
	root = new Node<E>(data);
    }

    public E search(E i){
	Node<E> tmp = root;
	while (tmp != null){
	     int c = tmp.compareTo
	}
    }
}

class Node<E>{
    private final E data;
    private Node<E> left;
    private Node<E> right;
    
    public Node(E data){
	this.data = data;
    }

    public void setRight(Node<E> right){
	this.right = right;
    }

    public void setLeft(Node<E> left){
	this.left = left;
    }

    public Node<E> getRight(){
	return right;
    }

    public Node<E> getLeft(){
	return left;
    }

    public E getData(){
	return data;
    }
}
