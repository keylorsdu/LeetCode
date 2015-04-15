package tricks;

public class MaxLengthTowChar {
	public int getlength(String s ){
		int i = 0 ;//indicate a;
		int j = -1 ; //indicate b
		int Maxlength = 0;
		for(int k = 1; k<s.length();k++){
			if(s.charAt(k)==s.charAt(i)){
				continue;
			}else if(j > 0 && (s.charAt(j)==s.charAt(k))){
			continue;	
			}else{
				Maxlength = Math.max(Maxlength, k-i);
				
			}
			
		}
		return 0;
	}

}
