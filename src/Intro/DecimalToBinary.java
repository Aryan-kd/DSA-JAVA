package Intro;
import java.util.Scanner;

public class DecimalToBinary {
	private static String toBinary(int n) {
		String result = "";
		while(n > 0) {
			result = (n&1) + result;
			n = n>>1;
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Decimal Number: ");
		int num = sc.nextInt();
		System.out.println(toBinary(num));
		
//		String result = "";
//		while(num>0) {
//			int rem= num%2;
//			num = num/2;
//			result += rem;
//		}
//		
//		int j=result.length()-1;
//		
//		String str = "";
//		while(j>=0) {
//			str += result.charAt(j);
//			j--;
//		}
//		
//		System.out.println(str);
		sc.close();
	}

}
