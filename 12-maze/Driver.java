public class Driver {
    public static void main(String[] args) {
	// Node n=new Node();
	// Node n2=new Node(1,2);
	// n.setNext(n2);
	// System.out.println(n.getNext().getx());
	// System.out.println(n2);
	maze m = new maze();
	System.out.println(m.solve(1,1));
    }
}
