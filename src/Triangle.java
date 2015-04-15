import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Triangle {
	 public int minimumTotal(List<List<Integer>> triangle) {
		 
		 for(int i = triangle.size()-2;i>=0;i--){
			 ArrayList<Integer> list = (ArrayList<Integer>) triangle.get(i);
			 for(int j = 0;j<list.size();j++){
				 int mcost=0;
				 ArrayList<Integer> list2 = (ArrayList<Integer>) triangle.get(i+1);
				 mcost = Math.min(list2.get(j), list2.get(j+1))+list.get(j);
				list.set(j, mcost);
				 
			 }
		 }
		 
		return (triangle.get(0).get(0));
	        
	    }

}
