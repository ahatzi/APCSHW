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
	if (tmp.getRight() == null && tmp.getLeft() == null){
	    if (tmp.getData().compareTo(parent.getData()) > 0){
		parent.setRight(null);
	    }
	    else{
		parent.setLeft(null);
	    }
	}
	else if ((tmp.getLeft()==null) != (tmp.getRight()==null)){
	    if ((tmp.getData().compareTo(parent.getData()) > 0) && (tmp.getLeft() != null)){
		parent.setRight(tmp.getLeft());
	    }
	    else if ((tmp.getData().compareTo(parent.getData()) > 0) && (tmp.getRight() != null)){
		parent.setRight(tmp.getRight());
	    }
	    else if ((tmp.getData().compareTo(parent.getData()) < 0) && (tmp.getLeft() != null)){
		parent.setLeft(tmp.getLeft());
	    }
	    else{
		parent.setLeft(tmp.getRight());
	    }
	}
	else if ((tmp.getLeft() != null) && (tmp.getRight() != null)){
	    Node<E> leftBranch = tmp.getLeft();
	    Node<E> trailer = tmp.getLeft();
	    int count = 0;
	    while (leftBranch.getRight() != null){
		trailer = leftBranch;
		leftBranch = leftBranch.getRight();
		count++;
	    }
	    trailer.setRight(null);
	    if (tmp.getData().compareTo(parent.getData()) > 0){
		parent.setRight(leftBranch);
	    }
	    else{
		parent.setLeft(leftBranch);
	    }
	    if (count > 0){
		leftBranch.setRight(tmp.getRight());
		leftBranch.setLeft(tmp.getLeft());
	    }
	    else{
		leftBranch.setRight(tmp.getRight());
	    }
	}
    }

    public E max(E data1,E data2,E data3){
	if (data1 == null){
	    if (data2 > data3){
		return data2;
	    }
	    else{
		return data3;
	    }
	}
	else if (data2 == null){
	    if (data1 > data3){
		return data1;
	    }
	    else{
		return data3;
	    }
	}
	else if (data3 == null){
	    if (data1 > data2){
		return data1;
	    }
	    else{
		return data2;
	    }
	}
	else if (data1 >= data2 && data1 >= data3){
	    return data1;
	}
	else if (data2 >= data1 && data2 >= data3){
	    return data2;
	}
	else{
	    return data3;
	}
    }

    public E max(Node<E> node){
	if (node == null){
	    return;
	}
	else if (node.getLeft() == null && node.getRight() == null){
	    return;
	}
	else{
	    E max = node.getData();
	    E left = max(node.getLeft());
	    E right = max(node.getRight());
	    return max(left,right,max);
	}
    }

    public int height(Node<E> node){
	if (node.getLeft() == null && node.getRight() == null){
	    return 1;
	}
	else if(node == null){
	    return;
	}
	else{
	    int left = 1 + height(node.getLeft());
	    int right = 1 + height(node.getRight());
	    if (left > right){
		return left;
	    }
	    else{
		return right;
	    }
	}
    }

    public int diameter(Node<E> node){
	
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
	A.insert(47);
	A.insert(13);
	A.insert(7);
	A.insert(16);
	A.insert(26);
	A.insert(40);
	A.insert(48);
	A.insert(75);
	A.insert(60);
	A.insert(84);
	System.out.println(A);
	A.delete(13);
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
