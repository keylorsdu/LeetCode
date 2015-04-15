import java.util.ArrayList;
import java.util.List;


public class MaxProduct {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();
	public int maxProduct(int[] A){
		if(A.length<2)
			return A[0];
		breaklist(A);
		ArrayList<Integer> results = new ArrayList<Integer>();
		System.out.println(lists);
		for(List<Integer> list: lists){
			results.add(maxoflist(list));
			System.out.println(results);
		}
		int max = A[0];
		for(int j = 0;j<A.length;j++){
		    max = Math.max(A[j],max);
		}
		results.add(max);
		return maxresult(results);
		
	}
	public int maxoflist(List<Integer> list){
		ArrayList<Integer> maxs = new ArrayList<Integer>();
		if(list.size()<2){
			//only one element
			return list.get(0);
		}
		int product = 1;
		for(Integer i: list){
			product *= i;
		}
		maxs.add(product);
		
		
		
		
		for(int i = 0 ;i<list.size();i++){
			
			maxs.add(product/list.get(i));
		}
		System.out.println("maxs"+maxs);
		return maxresult(maxs);
	}
	public void breaklist(int[] A){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;
		while(i < A.length){
			if(A[i] != 0){
				list.add(A[i]);
			}else{//A[i]=0
				if(list.size()>0){
					lists.add(list);
					System.out.println("added"+list);
					System.out.println("lists "+lists);
				}
				list = new ArrayList<Integer>();
			}
			i++;
		}
		if(list.size()>0){
			lists.add(list);
			System.out.println("added"+list);
		}
		
	
		
	}
public int maxresult(List<Integer> list){
        
        int max = list.get(0);
        for(Integer i :list){
            max = Math.max(max,i);
        }
        return max;
    }
public static void main(String[] args) {
	MaxProduct mp = new MaxProduct();
	System.out.println(mp.maxProduct(new int[]{3,-1,4}));
	
}

}
