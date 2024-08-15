package stackIntro;

public class MyStack {

	private int[] items;
	private int top;
	private int size;
	
	public MyStack(int size) {
		this.size = size;
		this.items = new int[size];
		this.top = -1;
	}
	
	public void push(int n) {
		this.top++;
		if(top >= size) {
			System.out.println("Stack Overflow");
			this.top--;
			return;
		}
		items[this.top] = n;
		return;
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println(this.items[this.top]);
		this.top--;
		return;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println(this.items[this.top]);
		return;
	}
	
	public String toString() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return "";
		}
		int n = this.top;
		StringBuilder str = new StringBuilder();
		str.append("[ ");
		while(n>=0) {
			str.append(this.items[n]).append(" ");
			n--;
		}
		str.append("]");
		return str.toString();
	}

}
