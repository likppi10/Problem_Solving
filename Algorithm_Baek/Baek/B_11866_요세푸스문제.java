package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_11866_요세푸스문제 {
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		yosepuse(N,K);
		sc.close();
	}
	static void yosepuse(int N, int K) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=N; i++)	queue.offer(i);
		
		while(queue.size() != 0) {
			for(int j=1; j<K; j++) {
				queue.offer(queue.poll());
			}
			list.add(queue.poll());
		}
		
		for(int k=0; k<list.size();k++) {
			System.out.print(list.get(k)+ " ");
		}
	}
}
