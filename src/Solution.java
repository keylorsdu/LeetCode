import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Solution {
	
	public static Map<Character,Character> map = new HashMap<Character,Character>(){{
		put('{','}');
		put('(',')');
		put('[',']');
		
	}
		
	};
	public boolean isvalid(String s){
		Stack<Character> stack = new Stack<Character>();
		for(char c:s.toCharArray()){
			if(map.containsKey(c)){
				stack.push(c);
			}else{
				if(stack.isEmpty()||map.get(stack.pop())!=c)
					return false;
				}
			
		}
		
		return stack.isEmpty();
		
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isvalid("{}()[]"));
		System.out.println(solution.isvalid("({})"));
		System.out.println(solution.isvalid("({)}"));
	}

}
