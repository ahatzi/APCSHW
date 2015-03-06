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

}
