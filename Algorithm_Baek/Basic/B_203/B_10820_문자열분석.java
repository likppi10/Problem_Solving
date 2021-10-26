package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10820_문자열분석 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for(int tc=0; tc<100; tc++) {
			String mun = br.readLine();
			if(mun!=null) {
				char[] cA = mun.toCharArray();
				int[] res = new int[4];
				
				for(int i=0; i<cA.length; i++) {
					if(cA[i]>='a' && cA[i]<='z') {
						res[0]++;
					}else if(cA[i]>='A' && cA[i]<='Z') {
						res[1]++;
					}else if(cA[i]>='0' && cA[i]<='9') {
						res[2]++;
					}else {
						res[3]++;
					}
				}
				
				for(int i=0; i<res.length; i++) {
					sb.append(res[i] + " ");
				}
				sb.append("\n");
			}else {
				continue;
			}
			
			
		}
		
		System.out.println(sb);
	}
}
