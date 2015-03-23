import java.io.*;
import java.util.*;

public class LList<E> implements Iterable<E> {
    private Node<E> l=new Node<E>(null);
    private int len = 0;

    public Iterator<E> iterator(){
	LLit<E> i = new LLit<E>(l.getNext());
	return i;
    }

    public void add(E s){
	Node<E> tmp = new Node<E>(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public String toString(){
	String s = "";
	Node<E> tmp;
	for (tmp = l.getNext(); tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public E get(int n){
	Node<E> l2 = l.getNext();
	for (int i=n;i>0;i--){
	    Node l3 = l2.getNext();
	    l2 = l3;
	}
	return l2.getData();
    }

    public void add(int n, E s){
	Node<E> a = new Node<E>(s);
	Node<E> l2 = l;
	for (int i=n;i>0;i--){
	    Node<E> l2 = l2.getNext();
	}
	a.setNext(l2.getNext());
	l2.setNext(a);
	l = l2;
	len++;
    }

    public boolean remove(E s){
        Node<E> T = l;
	while (T.getNext() != null){
	    if (T.getNext().getData() == s){
		T.setNext(T.getNext().getNext());
		return true;
	    }
	}
	return false;
    }
}
