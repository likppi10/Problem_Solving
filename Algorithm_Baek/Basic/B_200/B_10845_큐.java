package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_10845_큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<cnt; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String order = st.nextToken();
			if(order.equals("push")) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}else if(order.equals("pop")) {
				if(queue.isEmpty()) sb.append(-1+"\n");
				else sb.append(queue.poll()+"\n");
			}else if(order.equals("size")) {
				sb.append(queue.size()+"\n");
			}else if(order.equals("empty")) {
				if(queue.isEmpty()) sb.append(1+"\n");
				else sb.append(0+"\n");
			}else if(order.equals("front")) {
				if(queue.isEmpty()) sb.append(-1+"\n");
				else sb.append(queue.peek()+"\n");
			}else {
				if(queue.isEmpty()) sb.append(-1+"\n");
				else{
					for(int j=0; j<queue.size(); j++) {
						if(j==queue.size()-1) sb.append(queue.peek()+"\n");
						queue.offer(queue.poll());
					}
				}
				
			}
		}
		
		System.out.println(sb);
	}
}
