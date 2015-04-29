import java.util.Random;

public class binaryTree<E extends Comparable<E>>{
    private Node<E> root = null;
    
    public binaryTree(E data){
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

    public Node<E> searchParent(E i){
	Node<E> tmp = root;
	Node<E> parent = root;
	while (tmp != null){
	    int c = tmp.getData().compareTo(i);
	    if (c == 0){
		return parent;
	    }
	    else if (c > 0){
		parent = tmp;
		tmp = tmp.getLeft();
	    }
	    else{
		parent = tmp;
		tmp = tmp.getRight();
	    }
	}
	return null;
    }
    
    public void insert(E i){
	if (root == null){
	    root = new Node<E>(i);
	    return;
	}
	Node<E> trailer = null;
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

    public void delete(E i){
	Node<E> tmp = search(i);
	Node<E> parent = searchParent(i);
	if (tmp.getRight == null && tmp.getLeft == null){
	    if (tmp.getData() > parent.getData()){
		parent.setRight(null);
	    }
	    else{
		parent.setLeft(null);
	    }
	}
	else if ((tmp.getLeft()==null) != (tmp.getRight==null)){
	    if ((tmp.getData() > parent.getData()) && (tmp.getLeft() != null)){
		parent.setRight(tmp.getLeft());
	    }
	    else if ((tmp.getData() > parent.getData()) && (tmp.getRight() != null)){
		parent.setRight(tmp.getRight());
	    }
	    else if ((tmp.getData() < parent.getData()) && (tmp.getLeft() != null)){
		parent.setLeft(tmp.getLeft());
	    }
	    else{
		parent.setLeft(tmp.getRight());
	    }
	}
	else if ((tmp.getLeft() != null) && (tmp.getRight() != null)){
	    Node<E> leftBranch = tmp.getLeft();
	    while (leftBranch != null){
		
	    }
	}
    }

    public String Traverse(Node<E> node){
	String retstr = "";
	if (node == null){
	    retstr += "";
	}
	else{
	    retstr += node;
	    retstr += " ---> Left(";
	    retstr += Traverse(node.getLeft());
	    retstr += ")";
	    retstr += " ---> Right(";
	    retstr += Traverse(node.getRight());
	    retstr += ")";
	}
	return retstr;
    }

    public String toString(){
        return Traverse(root);
    }

    public static void main(String[] args){
	binaryTree<Integer> A = new binaryTree<Integer>(50);
	Random r = new Random();
	for (int i = 0;i<10;i++){
	    A.insert(r.nextInt(100));
	}
	System.out.println(A);
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

    public String toString(){
	return data.toString();
    }
}
