package Recursion;

import java.util.Scanner;

public class B_10870_피보나치수5 {
	//
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.print(pibonachi(num));
	}
	static int pibonachi(int num) {
		if(num == 0) {
			return 0;
		}else if(num == 1) {
			return 1;
		}else {
			return pibonachi(num-2)+pibonachi(num-1);
		}
	}
}
