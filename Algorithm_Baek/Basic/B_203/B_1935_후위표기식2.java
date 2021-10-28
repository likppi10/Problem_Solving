package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_1935_후위표기식2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String M = br.readLine();
		Stack<Double> stack = new Stack<>();
		int[] nums = new int[26];
		
		for(int i=0; i<N; i++) nums[i] = Integer.parseInt(br.readLine());
		char[] cA = M.toCharArray();
		
		for(int i=0; i<cA.length; i++) {
			if(cA[i]=='+') {
				stack.add(stack.pop()+stack.pop());
			}else if(cA[i]=='-') {
				double a = stack.pop();
				double b = stack.pop();
				stack.add(b-a);
			}else if(cA[i]=='*') {
				stack.add(stack.pop()*stack.pop());
			}else if(cA[i]=='/') {
				double a = stack.pop();
				double b = stack.pop();
				stack.add(b/a);
			}else {
				stack.add((double) (nums[cA[i]-'A']));
			}
		}
		
		System.out.print(String.format("%.2f", stack.pop()));
	}
}
