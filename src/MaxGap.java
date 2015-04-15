
public class MaxGap {

	 public int maximumGap(int[] num) {
		int len = num.length;
		int i=0;
		int max  = 0;
		int min = 0;
		if(num.length < 2){return 0;}
		for(i = 0;i<len ;i++){
			if(max<num[i])
				max= num[i];
			if(min>num[i])
				min = num[i];
		}
		double gap = (double)(max - min)/(double)(len-1);
		boolean[] isNotEmpty = new boolean[len-1];/*
		for(i = 0 ;i<len;i++){
			isNotEmpty[Math.min((int)Math.floor((double)(num[i]-min)/gap), len-2)]=true;
		}*/
		Gap[] gaps = new Gap[len-1] ;
		for(i = 0;i<len-1;i++){
			gaps[i]=new Gap();
		}
		//assign
		for(i = 0;i<len;i++){
			int index = (int)Math.min((int)Math.floor((num[i]-min)/gap),len-2);
			isNotEmpty[index]=true;
			if(gaps[index].low== -1){
				gaps[index].low=num[i];
				
			}else  
			gaps[index].low = Math.min(gaps[index].low, num[i]);
			if(gaps[index].high == -1){
				gaps[index].high = num[i];
			}else 
			gaps[index].high = Math.max(gaps[index].high, num[i]);
				
		}
//		find
		int low=0;
		int high=0;
		int maxgap=0;
		int j=0;
		for(i = 0;i<len -1;i++){
		   maxgap = (int) Math.max(gaps[i].high-gaps[i].low, maxgap);
		   
		   j = i;
		   //low
		   while(--j>=0){
			   if(isNotEmpty[j]){
				   break;
			   }
		   }
		   if(j>=0)
		   maxgap = (int)Math.max(gaps[i].low-gaps[j].high, maxgap);
		   
		   j = i;
		   while(++j<num.length-2){
			   if(isNotEmpty[i])
				   break;
		   }
		   if(j<gaps.length)
		   maxgap = Math.max(gaps[j].low-gaps[i].high, maxgap);
		   
		   
			
			
		}
		
		 
		return maxgap;
	        
	 }
	 class Gap{
			int low;
			int high;
			Gap(){
				low = -1;
				high = -1;
			}
			Gap(int x,int y){
				low = x;
				high = y;
			}
		
		}
	 public static void main(String[] args) {
		MaxGap mp = new MaxGap();
//		System.out.println(mp.maximumGap(new int[]{,3,2,1}));
	}
}
