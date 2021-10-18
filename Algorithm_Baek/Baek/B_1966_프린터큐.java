package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1966_프린터큐 {
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int casecount = sc.nextInt();
		for(int i=0; i<casecount ; i++) {
			int printcount = sc.nextInt();
			int printwhere = sc.nextInt();
			ArrayList<Integer> printimportant = new ArrayList<>();
			for(int j=0; j<printcount ; j++) {
				printimportant.add(sc.nextInt());
			}
			printing(printcount, printwhere, printimportant);
		}	
		sc.close();
	}
	static void printing(int printcount, int printwhere, ArrayList<Integer> printimportant) {
		int index = printwhere;
		int count = 0;
		for(int i=0; i<printimportant.size(); i++ ) {
			queue.offer(printimportant.get(i));
		}
		Collections.sort(printimportant);
		
		while(queue.size() != 0){
			if(queue.peek()<printimportant.get(printimportant.size()-1)) {
				queue.offer(queue.poll());
				if(index>0) index = index -1;
				else index = queue.size()-1;
			}else {
				printimportant.remove(printimportant.size()-1);
				queue.poll();
				count++;
				if(index>0) index = index -1;
				else if(index == 0) {
					System.out.println(count);
					break;
				}
			}
		}
	}
}

