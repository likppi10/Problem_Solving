package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1929_소수구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=a; i<=b; i++) {
			
			
			if(i==1) continue;
			
			int idx=2;
			boolean check = true;
			while(idx<=Math.sqrt(i)) {
				if(i%idx==0) {
					check = false;
					break;
				}
				idx++;
			}
			if(check) sb.append(i+"\n");
		}
		System.out.println(sb);
		
	}
}