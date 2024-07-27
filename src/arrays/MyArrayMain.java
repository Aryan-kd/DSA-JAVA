package arrays;

public class MyArrayMain {

	public static void main(String[] args) {
		MyArray arr = new MyArray(5);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(5);
		arr.insert(6);
		arr.insert(7);
		System.out.println(arr);
		
		arr.remove(3);
		System.out.println(arr);
		
		System.out.println("7 is at index: " + arr.find(7));
		System.out.println("Max Element: " + arr.maxElement());
		System.out.println("Min index: " + arr.minElement());
		
		arr.reverse();
		System.out.println(arr);
	}

}
