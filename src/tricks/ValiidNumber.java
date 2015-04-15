package tricks;

public class ValiidNumber {
	public boolean valid(String s){
		char[] c = s.toCharArray();
		int begin =0;
		int end  = c.length-1;
		for(;c[begin]== ' ' || c[begin]=='+'|| c[begin]=='-'; begin++){
			
		}
		for(;c[end]== ' ' || c[end]=='+'|| c[end]=='-'; end--){
			
		}
		System.out.println(begin +" ::"+ end+"white space escape:"+s.substring(begin,end));
		int dotcount = 0;
		for(int i = begin; i <= end ;i++){
			if(c[i]=='.'){
				if(dotcount >= 1){
					return false;
				}
				dotcount ++;
				
				if( (!Character.isDigit(c[i+1]))  &&  (!Character.isDigit(c[i-1]))  ){
					return false;
				}
				
			}else{
				if(!Character.isDigit(c[i])){
					System.out.println(c[i]+" is not digit" + " index :"+ i);
					return false;
					
				}
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		ValiidNumber vn = new ValiidNumber();
		System.out.println(Character.isDigit('3'));
		System.out.println(vn.valid("+232 "));
		System.out.println(vn.valid("    +-32  "));
		System.out.println(vn.valid("    +2b2  "));
		System.out.println(vn.valid("    +2.32  "));
		System.out.println(vn.valid("    -23.54.2  "));
	}
	

}
