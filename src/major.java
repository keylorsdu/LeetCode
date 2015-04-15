import java.util.HashMap;
import java.util.Map;


public class major {
	
	    public int majorityElement(int[] num) {
	        
	        int major = 0;
	        int n = num.length;
	        int mnum=0;
	        int mcount = n/2;
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        int i;
	        for (i = 0;i<n;i++){
	            if(!map.containsKey(num[i])){
	            	map.put(num[i], 1);
	            }else{
	            	map.put(num[i], map.get(num[i])+1);
	            }
	        }
	        
	       
	        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
	        	if(entry.getValue()>mcount){
	        		mnum = entry.getKey();
	        	}
	        }
	       return mnum;
	    }
	    public static void main(String[] args) {
			major mj = new major();
			System.out.println(mj.majorityElement(new int[]{1,2,3,4,4,4,4}));
			System.out.println(mj.majorityElement(new int[]{1,2,3,4,4,8,4}));
			System.out.println(mj.majorityElement(new int[]{1}));
			System.out.println(mj.majorityElement(new int[]{1,6,2,6,3,4,6,4,6,5,6,6,5,6,6,4,6}));
			
		}
	

}
