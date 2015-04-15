
public class TitleToNumber {
	public int map(char c){
		
		return c-'A'+1;
		
	}
	public int parseint(int n,int rad){
		return rad;
		
	}
	 public int titleToNumber(String s) {
		 int digit=0;
		 int result = 0;
		 
		 
		 for(Character c:s.toCharArray()){
			 digit = map(c);
			 result *= 26;
			 result += digit;
		 }
		
		return result;
		 
	        
	 }
	 public static void main(String[] args) {
		 TitleToNumber tn = new TitleToNumber();
		System.out.println(tn.titleToNumber("A"));
		System.out.println(tn.titleToNumber("Z"));
//		Integer.valueOf("");
		System.out.println(tn.titleToNumber("AA"));
		System.out.println(tn.titleToNumber("CA"));
		
	}

}
