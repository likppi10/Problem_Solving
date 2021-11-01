package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1978_소수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int res = 0;
		
		int cnt = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<cnt; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			if(a==1) continue;
			
			int idx=2;
			boolean check = true;
			while(idx<a) {
				if(a%idx==0) {
					check = false;
					break;
				}
				idx++;
			}
			if(check) res++;
		}
		System.out.println(res);
		
	}
}
