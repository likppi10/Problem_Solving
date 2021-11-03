package Recursion;

import java.util.Scanner;

public class CU_1930_supersum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.print(supersum(a,b));
	}
	static int supersum(int a,int b) {
		if(a == 0) {
			return b;
		}else {
			int result = 0;
			for(int i=1; i<=b; i++) {
				result = result + supersum(a-1,i);
			}
			return result;
		}
	}
}
