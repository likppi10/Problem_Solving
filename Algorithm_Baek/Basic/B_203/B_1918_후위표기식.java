package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_1918_후위표기식 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		char[] sA = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<sA.length; i++) {
			if(sA[i] == ')') {
				while(!stack.isEmpty() && stack.peek()!='(') sb.append(stack.pop());
				if(!stack.isEmpty()) stack.pop();
			}else if(sA[i]=='+' || sA[i]=='-') {
				while(!stack.isEmpty() && stack.peek()!='(') sb.append(stack.pop());
				stack.add(sA[i]);
			}else if(sA[i]=='*' || sA[i]=='/') {
				while(!stack.isEmpty() && (stack.peek()!='+' && stack.peek()!='-' && stack.peek()!='(') ) sb.append(stack.pop());
				stack.add(sA[i]);
			}else if(sA[i]=='(') stack.add(sA[i]);
			else sb.append(sA[i]);
		}
		
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		System.out.println(sb);
	}
}
