package Recursion;

import java.util.Scanner;
//????
public class CU_4564_계단오르기 {
	static int stairs = 0;
	static int double_count = 0;
	static int point = 0;
	static int maxpoint = 0;
	static int now_stair = -1;	
	static int[] stairpoint;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		stairs = sc.nextInt();
		stairpoint = new int[stairs];
		for(int i=0; i<stairs; i++) {
			stairpoint[i] = sc.nextInt();
		}
		
		stair();
		System.out.print(maxpoint);
	}
	static void stair() {
		if(double_count == 2) {
			doublestair();
			double_count = 0;
		}else {
			onestair();
			doublestair();
		}
	}
	static void onestair() {
		now_stair++;
		point = point + stairpoint[now_stair];
		double_count++;
		if(now_stair != stairs-1) {
			stair();
		}else {
			if(maxpoint<point) {
				maxpoint = point;
			}
			now_stair = -1;
			point = 0;
			double_count = 0;
		}
	}
	static void doublestair() {
		now_stair = now_stair+2;
		point = point + stairpoint[now_stair];
		double_count = 0;
		if(now_stair == stairs-2) {
			onestair();
		}else if(now_stair+2 < stairs){
			stair();
		}else {
			if(maxpoint<point) {
				maxpoint = point;
			}
			now_stair = -1;
			point = 0;
			double_count = 0;
		}
	}
}
