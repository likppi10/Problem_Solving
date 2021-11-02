package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2004_조합0의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		int cnt_2 = 0;
		int cnt_5 = 0;
		
		while(n-m>=0) {
			long x = n;
			while(x%2==0) {
				cnt_2++;
				x = x/2;
			}
			while(x%5==0) {
				cnt_5++;
				x = x/5;
			}
			n--;
		}
		
		while(m>0) {
			long x = m;
			while(x%2==0) {
				cnt_2--;
				x = x/2;
			}
			while(x%5==0) {
				cnt_5--;
				x = x/5;
			}
			m--;
		}
		if(Math.min(cnt_2, cnt_5) < 0) System.out.println(0);
		else System.out.println(Math.min(cnt_2, cnt_5));
	}
}
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
// 
//public class Main {
// 
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
// 
//		long N = Long.parseLong(st.nextToken());
//		long M = Long.parseLong(st.nextToken());
// 
//		// 각각의 승수를 구해준다.
//		long count5 = five_power_n(N) - five_power_n(N - M) - five_power_n(M);
//		long count2 = two_power_n(N) - two_power_n(N - M) - two_power_n(M);
//		System.out.println(Math.min(count5, count2));
// 
//	}
// 
//	// 5의 승수를 구하는 함수
//	static long five_power_n(long num) {
//		int count = 0;
// 
//		while (num >= 5) {
//			count += (num / 5);
//			num /= 5;
//		}
//		return count;
//	}
// 
//	// 2의 승수를 구하는 함수
//	static long two_power_n(long num) {
//		int count = 0;
// 
//		while (num >= 2) {
//			count += (num / 2);
//			num /= 2;
//		}
//		return count;
//	}
// 
//}
