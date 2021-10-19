package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_2164_카드2 {
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		
		int card = sc.nextInt();
		cardmove(card);
		sc.close();
	}
	
	static void cardmove(int card) {
		for(int i=1 ; i<=card; i++) queue.offer(i);
		while(queue.size() != 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.print(queue.poll());
	}
}
