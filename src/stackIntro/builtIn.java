package stackIntro;

import java.util.Stack;

public class builtIn {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek());
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");	
		}
	}

}
