package Recursion;

import java.util.Scanner;

public class B_11729_하노이탑이동순서 {

	static int count = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		hanoi(num,1,2,3);
		System.out.println(count);
	}
	
	static void hanoi(int num, int start, int middle, int end) {
		if(num == 1) {
			moving(1,start,end);
		}else {
			hanoi(num-1,start,end,middle);
			moving(num,start,end);
			hanoi(num-1,middle,start,end);
		}
		count++;
	}
	
	static void moving(int num,int start,int end) {
		System.out.println(start + " "+ end);
	}
}
