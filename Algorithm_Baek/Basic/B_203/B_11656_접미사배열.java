package B_203_자료구조1참고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11656_접미사배열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String word = br.readLine();
		String[] words = new String[word.length()];
		
		for(int i=0; i<word.length(); i++) words[i] = word.substring(i);
		Arrays.sort(words);
		for(int i=0; i<word.length(); i++) sb.append(words[i]+"\n");
		System.out.println(sb);
	}
}
