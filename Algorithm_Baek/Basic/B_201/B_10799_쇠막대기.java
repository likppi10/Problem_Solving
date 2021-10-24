package B_201_자료구조1연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10799_쇠막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] I = br.readLine().toCharArray();
		int st = 0;
		int res = 0;
		
		for(int i=0; i<I.length; i++) {
			if(I[i] == '(') {
				if(i<I.length-1) {
					if(I[i+1] == ')') {
						res += st;
						i++;
					}else st++;
				}else st++;
			}else if(I[i] == ')') {
				res++;
				st--;
			}
		}
		
		System.out.println(res);
	}
}
