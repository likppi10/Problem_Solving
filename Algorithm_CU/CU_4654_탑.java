package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CU_4654_탑 {

	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int top_count = sc.nextInt();
		int[] height = new int[top_count];
		
		for(int i=0; i< top_count;i++) {
			height[i] = sc.nextInt();
		}
		
		sc.close();
		raiser(height, top_count);
	}
	
	static void raiser(int[] height, int top_count) {
		int now = 0;
		int to = 0;
		int index=1;
		
		for(int j=0; j<height.length;j++) {
			reset(height,j);
			now = stack.pop();
			while(!stack.empty()) {
				to = stack.pop();
				if(now<to) {
					System.out.print(top_count-index);
					break;
				}
				index++;
				if(index==top_count) {
					System.out.print(0);
				}
			}
			index = 1;
			now = 0;
			to = 0;
			top_count--;
		}
	}
	
	static void reset(int[] height,int j) {
		stack = new Stack<Integer>();
		for(int i=0; i<height.length-j; i++) {
			stack.push(height[i]);
		}
	}
}
