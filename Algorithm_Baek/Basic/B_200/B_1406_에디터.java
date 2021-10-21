package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_1406_에디터 {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		String L = br.readLine();
		char[] la = L.toCharArray();
		
		int C = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		Stack<Character> res = new Stack<>();
		
		for(int i=0; i<la.length; i++) stack.add(la[i]);
		

		for(int i=0; i<C; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			if(order.equals("P")) stack.add(st.nextToken().toCharArray()[0]);
			else if(order.equals("B")) {
				if(!stack.isEmpty()) stack.pop();
			}else if(order.equals("D")) {
				if(!res.isEmpty()) stack.add(res.pop());
			}else {
				if(!stack.isEmpty()) res.add(stack.pop());
			}
		}
		
		while(!stack.isEmpty()) res.add(stack.pop());
		while(!res.isEmpty()) sb.append(res.pop());
		System.out.println(sb);
	}
	
}
