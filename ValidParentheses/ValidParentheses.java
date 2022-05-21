package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "{[]}{";
		System.out.println(s);
		boolean isValid=true;
		
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				isValid=false;
		}
		
		if(stack.isEmpty() && isValid!=false) {
			isValid=true;
		}else {
			isValid=false;
		}
		
		System.out.println(isValid);
	}

}
