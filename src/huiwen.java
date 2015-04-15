
public class huiwen {
	public int nhuiwen(String s,int l,int r){
		
		int count = 0;
		int i,j;
		for(i=l,j=r;(i>=0)&&(j<s.length())&&(s.charAt(i)==s.charAt(j));i--,j++){
			count +=2;
		}
		return count;
		
	}
	public int solution(String s){
		int n = s.length();
		int i =0;
		int mcount=1;
		
		for (i=0;i<n-1;i++){
			int count=1;
			if(s.charAt(i)==s.charAt(i+1)){
				count = nhuiwen(s,i,i+1);
				if(count >mcount){
					mcount = count;
				}
			}
			if((i+2<n)&&(s.charAt(i)==s.charAt(i+2))){
				count = 1+ nhuiwen(s,i,i+2);
				if(count >mcount){
					mcount = count;
				}
			}
			
		}
		return mcount;
	}
	public static void main(String[] args) {
		huiwen hw = new huiwen();
		System.out.println(hw.solution("aabbcc"));
		System.out.println(hw.solution("dsfhkdfgfd"));
		System.out.println(hw.solution("aaaaa"));
		System.out.println(hw.solution("aaaa"));
		System.out.println(hw.solution("ab"));
		System.out.println(hw.solution("aa"));
		System.out.println(hw.solution("aa"));
		System.out.println(hw.solution("aaBBaa"));
	}

}
