package Stack;

import java.util.Scanner;
import java.util.Stack;

public class B_10828_스택 {
	static Stack<Integer> stack = new Stack<>();
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		
		int order_count;
		order_count = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<=order_count ; i++) {
			String order = new String();
			order = sc.nextLine();
			stacker(order);
		}
		
		sc.close();
	}
	
	static void stacker(String order) {
		
		
		if(order.contains("push")) {
			stack.push(Integer.parseInt(order.substring(5)));
		}else if(order.contains("pop")){
			if(stack.size() > 0)System.out.println(stack.pop());
			else System.out.println(-1);
		}else if(order.contains("size")){
			System.out.println(stack.size());
		}else if(order.contains("empty")){
			if(stack.empty()) System.out.println(1);
			else System.out.println(0);
		}else if(order.contains("top")){
			if(stack.size() > 0)System.out.println(stack.peek());
			else System.out.println(-1);
		}
	}
}
