package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CU_4624_괄호의값 {

	static Stack<Character> stack = new Stack<Character>();
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String parenthesis = sc.nextLine();
		char[] array = parenthesis.toCharArray();
		
		calculate(array);
	}
	static void calculate(char[] array) {
		int finalresult = 0;
		int result = 0;
		int circleopen = 0;
		int squareopen = 0;
		
		for(int i=0; i<array.length; i++) {
			stack.push(array[i]);
		}
		char prev = stack.pop();
		if(prev == ')') {
			result = 2;
		}else if(prev == ']') {
			result = 3;
		}
		char now = '0';
		for(int j=1; j<stack.size(); j++) {
			now = stack.pop();
			if(now == ')') {
				if(prev == '(' && prev == '[') {
					result = result+2;
				}else {
					result = result*2;
				}
				circleopen++;
				prev = now;
			}else if(now == '(') {
				result = result*1;
				prev = now;
				circleopen--;
			}else if(now == ']') {
				if(prev == '(' && prev == '[') {
					result = result+3;
				}else {
					result = result*3;
				}
				squareopen++;
				prev = now;
			}else if(now == '[') {
				result = result*1;
				prev = now;
				squareopen--;
			}
		}
		System.out.print(result);
		
	}
}
