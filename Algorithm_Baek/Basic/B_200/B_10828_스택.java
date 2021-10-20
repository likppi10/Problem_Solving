package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_10828_스택 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			if(order.equals("push")){
				stack.add(Integer.parseInt(st.nextToken()));
				continue;
			}else if(order.equals("top")) {
				if(stack.isEmpty()) sb.append(-1);
				else sb.append(stack.peek());
			}else if(order.equals("size")) {
				sb.append(stack.size());
			}else if(order.equals("empty")) {
				if(stack.isEmpty()) sb.append(1);
				else sb.append(0);
			}else if(order.equals("pop")) {
				if(stack.isEmpty()) sb.append(-1);
				else sb.append(stack.pop());
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
