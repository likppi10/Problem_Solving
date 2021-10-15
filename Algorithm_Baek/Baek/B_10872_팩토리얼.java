package Recursion;

import java.util.Scanner;

public class B_10872_팩토리얼 {
	static int result = 1;
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		sc.close();
		System.out.print(factorial(num));
	}
	static int factorial(int num) {
		if(num == 0) {
			return result;
		}else {
			result = num * factorial(num-1);
			return result;
		}
	}
}
