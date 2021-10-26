package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10808_알파벳개수  {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		int[] al = new int[26];
		char[] w = word.toCharArray();
		
		for(int i=0; i<w.length; i++) al[w[i]-'a']++;
		for(int i=0; i<al.length; i++) sb.append(al[i]+" ");
		
		System.out.println(sb);
	}
}
