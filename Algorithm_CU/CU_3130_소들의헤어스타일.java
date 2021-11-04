package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CU_3130_소들의헤어스타일 {
	static Stack<Integer> stack = new Stack<Integer>();
	static int count = 0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int cow_count = sc.nextInt();
		int[] cow_hair = new int[cow_count];
		
		for(int i=0; i<cow_count; i++) {
			cow_hair[i] = sc.nextInt();
		}
		sc.close();
		
		see_hair(cow_hair, cow_count);
		
		System.out.print(count);
		
	}
	static void see_hair(int[] cow_hair, int cow_count) {
		for(int j=0; j<cow_count;j++) {
			stack = new Stack<Integer>();
			for(int k=j+1; k<cow_count;k++) {
				stack.push(cow_hair[k]);	
			}
			while(!stack.empty() && cow_hair[j] > stack.pop()) {
				count++;
			}
		}
	}
}
