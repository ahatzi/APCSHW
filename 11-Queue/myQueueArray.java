public class myQueueArray{
    private int front;
    private int back;
    private int chunk;
    private int[] a;

    public myQueueArray(int chunk){
	this.chunk = chunk;
	front = chunk;
	back = chunk;
	a = new int[chunk];
    }

    public myQueueArray(){
	this(100);
    }

    public void enqueue(int data){
	if (front == 0){
	    int[] newA = new int[a.length+chunk];
	    for (int i = 0;i<a.length;i++){
		newA[i+chunk] = a[i];
	    }
	}
	a[front-1] = data;
	front--;
    }

    public int dequeue(){
	int retval = a[back];
	back--;
	return retval;
    }

    public boolean empty(){
	return (front == back);
    }

    public int size(){
	return (back - front);
    }
}
