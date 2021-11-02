package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2609_최대공약수와최대공배수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		sb.append(gcd(a,b)+"\n");
		sb.append(lcm(a,b)+"\n");
		
		System.out.println(sb);
		
	}
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;	
			a = b;		
			b = r;
		}
		return a;
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
