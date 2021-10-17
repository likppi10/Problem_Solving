package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_18258_큐2 {
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int order_count = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<order_count;i++) {
			String order = new String();
			order = sc.nextLine();
			queue_order(order);
		}
		sc.close();
	}
	static void queue_order(String order) {
		if(order.contains("push")) {
			queue.offer(Integer.parseInt(order.substring(5)));
		}else if(order.contains("pop")) {
			if(queue.size() > 0)System.out.println(queue.poll());
			else System.out.println(-1);
		}else if(order.contains("size")) {
			System.out.println(queue.size());
		}else if(order.contains("empty")) {
			if(queue.size() == 0) System.out.println(1);
			else System.out.println(0);
		}else if(order.contains("front")) {
			if(queue.size() > 0)System.out.println(queue.peek());
			else System.out.println(-1);
		}else if(order.contains("back")) {
			if(queue.size() > 0) {
				if(queue.size() != 1) {
					for(int i=0; i<queue.size()-1; i++) {
						queue.offer(queue.poll());
					}
				}
				System.out.println(queue.peek());
				queue.offer(queue.poll());
			}
			else System.out.println(-1);
		}
	}
}
