package B_200_자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9012_괄호 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			Stack<Character> stack = new Stack<>();
			String line = br.readLine();
			char[] words = line.toCharArray();
			
			stack.add(words[0]);
			boolean cant = true;
			if(words[0]==')') {
				sb.append("NO\n");
				continue;
			}else {
				for(int j=1; j<words.length; j++) {
					if(words[j]=='(') stack.add(words[j]);
					else if(stack.isEmpty()){
						sb.append("NO\n");
						cant=false;
						break;
					} 
					else stack.pop();
				}	
				
			}
			
			if(stack.isEmpty()&&cant) sb.append("YES\n");
			else if(!stack.isEmpty()&&cant) sb.append("NO\n");
		}
		System.out.println(sb);
	}
}
