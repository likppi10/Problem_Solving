package Recursion;

import java.util.Scanner;
//???????//
public class B_2447_별찍기_XX {
	static String pattern = "***\n* *\n***";
	public static void main (String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int k = 0;
		
		while(num/3 == 1) {
			num = num/3;
			k++;
		}
		star(k);
	}
	static void star(int k) {
		if(k == 1) {
			for(int i=0; i<3 ; i++) {
				for(int j=0 ; j<3 ; j++) {
					if(i == 1 && j == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}System.out.println("");
			}
		}else if(k>1) {
			for(int i=0; i<3 ; i++) {
				for(int j=0 ; j<3 ; j++) {
					if(i == 1 && j == 1) {
						System.out.print(" ");
					}else {
						star(k-1);
					}
				}System.out.println("");
			}
		}
	}
}
