package B_201_자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_17413_단어뒤집기2 {
	
	private static Stack<Character> stack = new Stack<>();
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String M = br.readLine();
		char[] cA = M.toCharArray();	
		
		for(int i=0; i<cA.length; i++) {
			if(cA[i] == '<') {
				pop();
				sb.append(cA[i]);
				i++;
				while(cA[i] != '>') {
					sb.append(cA[i++]);
				}
				sb.append(cA[i]);
			}else if(cA[i] == ' ') {
				pop();
				sb.append(' ');
			}else stack.add(cA[i]);
		}
		pop();
		
		System.out.println(sb);
	}
	
	static void pop() {
		while(!stack.isEmpty()) sb.append(stack.pop());
	}
}
