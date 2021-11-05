package Recursion;

import java.util.Scanner;

public class CU_3733_우박수길이 {

	static int ubakcount = 0;
	static int[][] maxubak = {{0,0}};
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		for(int i=a+1; i<b; i++) {
			ubakcount = 0;
			ubak(i);
			if(maxubak[0][1]<ubakcount) {
				maxubak[0][0] = i;
				maxubak[0][1] = ubakcount;
			}
		}
		System.out.println(maxubak[0][0] + " " + maxubak[0][1]);
	}
	static void ubak(int n) {
		if(n != 1) {
			if(n%2 == 0) {
				n = n/2;
				ubak(n);
			}else {
				n = (3*n)+1;
				ubak(n);
			}
		}
		ubakcount++;
	}
}
