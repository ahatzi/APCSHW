public class binaryTree<E extends Comparable<E>>{
    private Node<E> root = null;
    
    public binaryTree<E>(E data){
	root = new Node<E>(data);
    }

    public Node<E> search(E i){
	Node<E> tmp = root;
	while (tmp != null){
	    int c = tmp.getData().compareTo(i);
	    if (c == 0){
		return tmp;
	    }
	    else if (c > 0){
		tmp = tmp.getLeft();
	    }
	    else{
		tmp = tmp.getRight();
	    }
	}
	return null;
    }

    public void insert(E i){
	Node<E> trailer;
	Node<E> tmp = root;
	while (tmp != null){
	    int c = tmp.getData().compareTo(i);
	    if (c > 0){
		trailer = tmp;
		tmp = tmp.getLeft();
	    }
	    else{
		trailer = tmp;
		tmp = tmp.getRight();
	    }
	}
	if (trailer.getData().compareTo(i) > 0){
	    trailer.setLeft(new Node<E>(i));
	}
	else{
	    trailer.setRight(new Node<E>(i));
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
