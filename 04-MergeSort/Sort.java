import java.util.ArrayList;
public class Sort{
    public ArrayList<Integer> mSort(ArrayList<Integer> list){
	if (list.size() == 1){
	    return list;
	}
	double divider = list.size()/2.0;
	ArrayList<Integer> front = new ArrayList<Integer>();
	ArrayList<Integer> back = new ArrayList<Integer>();
	int i;
	for (i=0;i<divider;i++){
	    front.add(list.get(i));
	}
	for (;i<list.size();i++){
	    back.add(list.get(i));
	}
	return merge(mSort(front),mSort(back));
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> retList = new ArrayList<Integer>();
	while(A.size()>0 && B.size()>0){
	    if (A.get(0) < B.get(0)){
		retList.add(A.remove(0));
	    }
	    else{
		retList.add(B.remove(0));
	    }
	}
	if (A.size() > 0){
	    while (A.size()>0){
		retList.add(A.remove(0));
	    }
	}
	else if (B.size() > 0){
	    while (B.size()>0){
		retList.add(B.remove(0));
	    }
	}
	return retList;
    }

    public static void main(String[] args){
	Sort m = new Sort();
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(20);
	a.add(5);
	a.add(17);
	a.add(1);
	a.add(100);
	a.add(98);
	a.add(2);
	System.out.println(a);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(3);
	b.add(4);
	b.add(7);
	b.add(8);
	b.add(10);
	b.add(22);
	b.add(52);
	//System.out.println(b);
	//System.out.println(m.merge(a,b));
	//System.out.println(a);
	System.out.println(m.mSort(a));
    }
}
