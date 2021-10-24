package B_201_자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_17299_오등큰수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int size = Integer.parseInt(br.readLine());
		int[] a = new int[size];
		int[] b = new int[1000001];
		int[] c = new int[size];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<size; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			b[a[i]]++;
		}
		
		
		for(int i=0; i<size; i++) {
			while(!stack.isEmpty() && b[a[stack.peek()]]<b[a[i]]) c[stack.pop()] = a[i];
			stack.add(i);
		}
		while(!stack.isEmpty()) c[stack.pop()] = -1;
		
		for(int i=0; i<size; i++) sb.append(c[i] + " ");
		
		System.out.println(sb);
	}
}
