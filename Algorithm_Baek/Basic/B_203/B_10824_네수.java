package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10824_네수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums, " ");
		
		System.out.println(Long.parseLong(st.nextToken()+st.nextToken()) + Long.parseLong(st.nextToken()+st.nextToken()));
	}
}
