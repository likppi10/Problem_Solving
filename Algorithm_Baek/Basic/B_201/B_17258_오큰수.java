package B_201_자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_17258_오큰수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int size = Integer.parseInt(br.readLine());
		int[] a = new int[size];
		int[] b = new int[size];
		Stack<Integer> stack = new Stack<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<size; i++) a[i] = Integer.parseInt(st.nextToken());
		
		stack.add(0);
		for(int i=1; i<size; i++) {
			while(!stack.isEmpty() && a[stack.peek()]<a[i]) b[stack.pop()] = a[i];
			stack.add(i);
		}
		
		while(!stack.isEmpty()) b[stack.pop()] = -1;
		
		for(int i=0; i<size; i++) sb.append(b[i] + " ");
		
		System.out.println(sb);
	}
}

//안됩니다.
//public class 오큰수_17258 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = null;
//		StringBuilder sb = new StringBuilder();
//		
//		int size = Integer.parseInt(br.readLine());
//		int[] a = new int[size];
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for(int i=0; i<size; i++) a[i] = Integer.parseInt(st.nextToken());
//		
//		for(int i=0; i<size; i++) {
//			int num = -1;
//			for(int j=i+1; j<size; j++) {
//				if(a[i]<a[j]) {
//					sb.append(a[j]+" ");
//					num = a[j];
//					break;
//				}
//			}
//			if(num == -1) sb.append("-1 ");
//		}
//		
//		System.out.println(sb);
//	}
//}
