public class sortArray{
    public int[] mSort(int[] list){
	if (list.length <= 1){
	    return list;
	}
	double divider = list.length/2.0;
	int[] front = new int[0];
	int[] back = new int[0];
	int i;
	int[] front2;
	for (i=0;i<divider;i++){
	    front2 = new int[front.length+1];
	    for (int j=0;j<front.length;j++){
		front2[j] = front[j];
	    }
	    front2[i] = list[i];
	    front = front2;
	}
	int[] back2;
	int backCount = 0;
	for (;i<list.length;i++){
	    back2 = new int[back.length+1];
	    for (int j=0;j<back.length;j++){
		back2[j] = back[j];
	    }
	    back2[backCount] = list[i];
	    backCount++;
	    back = back2;
	}
	return merge(mSort(front),mSort(back));
    }
    
    public int[] merge(int[] A, int[] B){
	int[] retArray = new int[A.length+B.length];
	int i;
	int jA = 0;
	int jB = 0;
        for (i=0;jA<A.length && jB<B.length;i++){
	    if (A[jA] < B[jB]){
		retArray[i] = A[jA];
		jA++;
	    }
	    else{
	       	retArray[i] = B[jB];
		jB++;
	    }
	}
	while (jA<A.length){
	    retArray[i] = A[jA];
	    jA++;
	}
	while (jB<B.length){
	    retArray[i] = B[jB];
	    jB++;
	}
	return retArray;
    }

    public static void main(String[] args){
	Sort m = new Sort();
	int[] a = new int[10];
	a[0] = 10;
	a[1] = 7;
	a[2] = 20;
	a[3] = 22;
	a[4] = 25;
	a[5] = 2; 
	a[6] = 6;
	a[7] = 18;
	a[8] = 1;
	a[9] = 21;
	for (int i=0;i<a.length;i++){
	    System.out.print(a[i] + ",");
	}
	System.out.println("\n");
        int[] b = new int[9];
	b[0] = 12;
	b[1] = 19;
	b[2] = 40;
	b[3] = 50;
	b[4] = 200;
	b[5] = 1220; 
	b[6] = 1300;
	b[7] = 1400;
	b[8] = 50000;
	//for (int i=0;i<b.length;i++){
	//  System.out.print(b[i] + ",");
	//}
	//System.out.println("\n");
	//System.out.println(b);
	//System.out.println(m.merge(a,b));
	//System.out.println(a);
	int[] cool;
	cool = m.mSort(a);
	for (int i=0;i<cool.length;i++){
	    System.out.print(cool[i] + ",");
	}
	System.out.println("\n");
    }
}
