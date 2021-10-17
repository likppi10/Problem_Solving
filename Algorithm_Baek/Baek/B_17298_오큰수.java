package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class B_17298_오큰수 {
	 static Stack<Integer> stack = new Stack<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		sc.nextLine();
		String nums = sc.nextLine();
		sc.close();
		
		String[] numArray = nums.split("\\s+");
		int[] numArrays = new int[size];
		
		int index = 0;
		for(String i : numArray) {
			numArrays[index] = Integer.parseInt(i);
			index++;
		}
		oknum(numArrays);
	}
	static void oknum(int[] numArray) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0 ; i<numArray.length ; i++ ) {
			stack = new Stack<>();
			for(int j=numArray.length-1 ; j>=i; j--) {
				if(numArray[j]>numArray[i]) stack.push(numArray[j]);
			}
			if(stack.size() == 0)result.add(-1);
			else result.add(stack.pop());
		}
		for(int k=0 ; k<result.size(); k++) System.out.print(result.get(k)+" ");
	}
}
