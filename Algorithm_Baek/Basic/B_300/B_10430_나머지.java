package B_300_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10430_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nums = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(nums, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		sb.append((A+B)%C + "\n");
		sb.append(((A%C)+(B%C))%C + "\n");
		sb.append((A*B)%C + "\n");
		sb.append(((A%C)*(B%C))%C + "\n");
		
		System.out.println(sb);
	}
}
