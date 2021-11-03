package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_6588_골드바흐의추측 {

	static int a = 3;
	static int b = 0;
	static int x;
	static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		/* 에라토네스의 체 */
		/*
		boolean[] chae = new boolean[1000001];
		for(int i=2; i<=1000000; i++) {
			if(!chae[i]) {
				for(int j=i*2; j<=1000000; j+=i) {
					chae[j]=true;
				}
			}
		}
		for(int i=1; i<=1000000; i++) {
			if(!chae[i]) {
				System.out.println(i);
			}
		}
		*/
		
		
		while(true) {
			a = 3;
			x = Integer.parseInt(br.readLine());
			if(x==0) break;
			b = getB(a);
			checkB(a,b);
		}
		
		System.out.println(sb);
	}
	
	static void getA(int nowA) {
//		if(a>x) return;
		int idx = 2;
		boolean check = true;
		while(idx<=Math.sqrt(nowA)){
			if(nowA%idx==0) {
				check = false;
				break;
			}
			idx++;
		}
		if(check) a = nowA;
		else getA(nowA+1);
	}
	
	static int getB(int nowA) {
		return x-nowA;
	}
	
	static void checkB(int nowA, int nowB) {
		
		int idx = 2;
		boolean check = true;
		while(idx<=Math.sqrt(nowB)){
			if(nowB%idx==0) {
				check = false;
				break;
			}
			idx++;
		}
		
		if(check) sb.append(x+" = "+nowA+" + "+nowB+"\n");
		else {
			getA(nowA+1);
//			if(a<x) {
				checkB(a,getB(a));
//			}else {
//				sb.append("Goldbach's conjecture is wrong.\n");
//			}
			
		}
	}
}
