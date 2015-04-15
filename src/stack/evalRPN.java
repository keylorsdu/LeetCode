package stack;

import java.util.Stack;

public class evalRPN {
    public int evalRPN(String[] tokens) {
		
        int a = 0,b = 0;
     

        Stack stack = new Stack<Integer>();
        for(String c:tokens){
            if(c == "+"){
                a=(int) stack.pop();
                b=(int) stack.pop();
                stack.push(a+b);
                continue;
            }
              if(c == "-"){
            	  a=(int) stack.pop();
                  b=(int) stack.pop();
                stack.push(a-b);
                 continue;
            }
              if(c == "*"){
            	  a=(int) stack.pop();
                  b=(int) stack.pop();
                stack.push(a*b);
                 continue;
            }
              if(c.equals("/")){
            	  a=(int) stack.pop();
                  b=(int) stack.pop();
                stack.push(b/a);
                 continue;
            }
            stack.push(Integer.valueOf(c));
        }
        int result = (int) stack.pop();
        
        return result;
        
    }
    public int evalRPN2(String[] tokens){
    	
    	
    	return 0;
    }
	public static void main(String[] args) {
		evalRPN rpn = new evalRPN();
		
		System.out.println(rpn.evalRPN(new String[]{"6","3","/"}));
	}

}
