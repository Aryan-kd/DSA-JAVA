package arrays;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Primitive
		int[] arr = new int[5];
		System.out.println(arr);
		Arrays.fill(arr, 0);
		for(int i=0;i<5;i++) {
			if((i&1) == 0) {
				arr[i]++;
			}
		}
		Arrays.sort(arr);
		for(int i=0;i<5;i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}

}
