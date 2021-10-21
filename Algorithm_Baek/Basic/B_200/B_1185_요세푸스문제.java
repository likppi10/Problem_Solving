package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1185_요세푸스문제 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) queue.add(i);
		
		sb.append("<");
		while(!queue.isEmpty()) {
			for(int i=0; i<K-1; i++) queue.add(queue.poll());
			if(queue.size()==1) sb.append(queue.poll());
			else sb.append(queue.poll()+", ");
		}
		sb.append(">");
		
		System.out.println(sb);
	}
}
