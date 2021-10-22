package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9093_단어뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			
			String[] words = br.readLine().split(" ");
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<words.length; j++) {
				
				char[] charray = words[j].toCharArray();
				for(int k=0; k<charray.length; k++) stack.add(charray[k]);
				while(!stack.isEmpty()) sb.append(stack.pop());
				sb.append(" ");
				
			}
			
			sb.append("\n");
			
		}
		System.out.println(sb);
		
	}
}
