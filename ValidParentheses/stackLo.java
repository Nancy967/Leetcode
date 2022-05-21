package ValidParentheses;

import java.util.Stack;

public class stackLo {

	public static void main(String[] args) {
		Stack<Character> color= new Stack<Character>();
		color.push('R');
		color.push('Y');
		color.push('G');
		System.out.println(color);
		color.pop();
		System.out.println(color);
		color.push('(');
		System.out.println(color);
	}
}
