package Intro;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check: ");
		int n = sc.nextInt();
		int k = (int) Math.sqrt(n);
		boolean flag = false;
		while(k != 1) {
			if(n%k == 0) {
				flag = true;
				break;
			}
			k--;
		}
		if(flag) {
			System.out.println("Number is not a Prime Number");
		}else {
			System.out.println("Number is a Prime Number");
		}
		sc.close();
	}

}
