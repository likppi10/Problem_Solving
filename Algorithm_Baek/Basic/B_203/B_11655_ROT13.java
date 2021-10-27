package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11655_ROT13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String mun = br.readLine();
		char[] cA = mun.toCharArray();
		
		for(int i=0; i<cA.length; i++) {
			if(cA[i]>='a' && cA[i]<='z'){
				char x = (char) (cA[i]+13);
				if(x>'z') x -= 26;
				sb.append(x);
			}else if(cA[i]>='A' && cA[i]<='Z'){
				char x = (char) (cA[i]+13);
				if(x>'Z') x -= 26;
				sb.append(x);
			}else {
				sb.append(cA[i]);
			} 
		}
		System.out.println(sb);
	}
}
