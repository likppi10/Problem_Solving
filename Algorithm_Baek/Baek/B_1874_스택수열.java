package Stack;

import java.util.Scanner;
import java.util.Stack;

public class B_1874_스택수열 {
	 static Stack<Integer> stack = new Stack<>();
	 static Stack<Integer> movedstack = new Stack<>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] numArray = new int[size];
		for(int i =0; i<size ; i++) {
			numArray[i] = sc.nextInt();
		}
		sc.close();
		push_pop(numArray);
	}

	static void push_pop(int[] numArray) {
		int[] compareArray = new int [numArray.length];
		for(int i=numArray.length ; i>0 ; i--) {
			movedstack.push(i);
		}
		
		int num = 0;
//		for(int i = 0 ;i<numArray.length; i++) {
//			
//				
//				
//				stack.push(movedstack.pop());
//				System.out.println("+");
//				if(numArray[i] > stack.peek()) {
//					while(numArray[i] != stack.peek()) {
//						if(movedstack.size() >0) {
//							stack.push(movedstack.pop());
//							System.out.println("+");
//						}else {break;}
//					}
//				}
//				compareArray[i] = stack.pop();
//				System.out.println("-");
//			
//			
//		}
		for(int i = 0 ;i<numArray.length; i++) {
			if(stack.empty()) {
				if(movedstack.size() >0) {
					stack.push(movedstack.pop());
					System.out.println("+");
					while(numArray[i] != stack.peek()) {
						if(movedstack.size() >0) {
							stack.push(movedstack.pop());
							System.out.println("+");
						}else {break;}
					}
					
					if(numArray[i] == stack.peek()) {
						compareArray[i] = stack.pop();
						System.out.println("-");
					}
				}else {break;}
			}else {
				if(numArray[i] > stack.peek()) {
					while(numArray[i] != stack.peek()) {
						if(movedstack.size() >0) {
							stack.push(movedstack.pop());
							System.out.println("+");
						}else {break;}
					}
				}
				compareArray[i] = stack.pop();
				System.out.println("-");
			}
			
		}
		for(int i=0; i<numArray.length; i++) {
			if(compareArray[i] != numArray[i]) {
				System.out.println("NO");
				break;
			}
		}
		
		
	}
}
