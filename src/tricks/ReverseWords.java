package tricks;

public class ReverseWords {
	public char[] reverseWord(String words) {
		char[] c = words.toCharArray();
		for(int i = 0,j =0;i <= c.length-1; i++){
			if(c[i]== ' '){
				reverse(c,j,i-1);
				j = i+1;
			}
			if(i == c.length-1){
				reverse(c,j,c.length-1);
			}
		}
		return reverse(c,0,c.length-1);
	}
	//reverse from begin to end
	public char[] reverse(char[] c,int b,int e){
		for(int i = b,j = e; i < j; i++,j--){
			char temp = c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		return c;
	}
	public static void main(String[] args) {
		ReverseWords rv = new ReverseWords();
		System.out.println(rv.reverseWord("keylor lidan"));
	}

}
