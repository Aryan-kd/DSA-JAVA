package Intro;
import java.util.Scanner;

public class BinaryToDecimal {
	private static int toDecimal(int s) {
		int ans = 0;
		int ind = 0;
		while(s != 0) {
			if(s%10 == 1) {
				ans+= (int) Math.pow(2, ind);
			}
			ind++;
			s/=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		System.out.println(toDecimal(n));
//		if((n & 1) == 1) {
//			System.out.println("Odd Number");
//		}else {
//			System.out.println("Even Number");
//		}
		sc.close();
	}

}
