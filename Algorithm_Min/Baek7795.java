package 알고_민규;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek7795 {

	private static int a;
	private static int b;
	private static int idx;
	private static int Sum;
	private static int[] al;
	private static int[] bl;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
						
			al = new int[a];
			bl = new int[b];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<a; j++) al[j] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<b; j++) bl[j] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(al);
			Arrays.sort(bl);
			/*
			Sum=0;
			for (int j : al) {
				for (int k : bl) { 
					if (j<=k) break; 
					else Sum ++; 
				}

			}
			*/
			Sum=0;
			for(int j=0; j<a; j++) {
				int res = search(al[j],0,b-1);
				if(al[j]<=bl[res]) res--; 	//남은 하나의 값 걔는 포함 되는지 안되는지 판단해야함
				if(res!=-1) Sum += res+1;	//개수를 세야하니까 1씩 더함 인덱스가 아니니까
			}
			
			sb.append(Sum+"\n");
		}
		System.out.println(sb);
	}

	static int search(int key, int low, int high) {
		int mid;

		if(low < high) {
			mid = (low + high) / 2;
			
			if(key <= bl[mid]) return search(key ,low, mid);   
			else return search(key, mid+1, high); 
		}
		
		if(low == high) return high;
		return -1; // 탐색 실패  
	}
}
