package stackIntro;

public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack(5);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.peek();
		System.out.println(stack);
	}

}
