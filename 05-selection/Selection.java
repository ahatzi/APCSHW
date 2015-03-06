public class Selection{
    public void partition(int[] a){
	int SI = 0;
	int EI = a.length-1;
	int[] D = new int[a.length];
	for (int i=0;i<SI;i++){
	    D[i] = a[i];
	}
	for (int i=EI+1;i<a.length;i++){
	    D[i] = a[i];
	}
	int pivot = a[SI];
	for (int i=SI+1;i<EI+1;i++){
	    if (a[i] < pivot){
		D[SI] = a[i];
		SI++;
	    }
	    else if(a[i] > pivot){
		D[EI] = a[i];
		EI--;
	    }
	}
	D[SI] = pivot;
    }
    
    public static void main(String[] args){
	Selection m = new Selection();
	int[] a = new int[6];
	a[0] = 3;
	a[1] = 8;
	a[2] = 2;
	a[3] = 12;
	a[4] = 5;
	a[5] = 10;
	m.partition(a);
	for (int i=0;i<a.length;i++){
	    System.out.print(a[i] + ",");
	}
    }

}
