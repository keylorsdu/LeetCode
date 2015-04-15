import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class SingleNumber {
	
	    public int singleNumber(int[] A) {
	    	int len = A.length;
	    	int i = 0 ;
	    	Map<Integer,Integer> map = new HashMap<Integer, Integer>();
	    	for (i = 0;i<len;i++) {
	    		if(!map.containsKey(A[i])){
	    			map.put(A[i], 1);
	    		}else{
	    			map.remove(A[i]);
	    		
	    		}
	    	}
	    	int result=0;
	    	for(Map.Entry<Integer, Integer> entry:map.entrySet()){
	    		result = entry.getKey();
	    		if(entry.getValue()==1)
		    		return result;
	    	}
			return result;
	        
	    }
	

}
