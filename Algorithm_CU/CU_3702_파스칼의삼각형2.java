package Recursion;

import java.util.Scanner;

public class CU_3702_파스칼의삼각형2 {

	static int[][] tri;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 int r = sc.nextInt();
		 int c = sc.nextInt();
		 sc.close();
		 
		 if(r>=c) tri = new int[r+1][r+1];
		 else tri = new int[c+1][c+1];
		 
		 for(int i=0;i<tri.length;i++) {
			 tri[0][i] = 1;
			 tri[i][0] = 1;
		 }
		 
		 
		 pascal(r,c);
		
		 
		 for(int i=1; i< tri.length; i++) {
			 for(int j=1; j<=i ; j++) {
				 tri[i][tri.length - j] = 0;
			 }
		 }
		 
		 for(int i=0; i< tri.length; i++) {
			 for(int j=0; j< tri.length; j++) {
				 System.out.print(tri[i][j]);
				 System.out.print("  ");
			 }
			 System.out.println("");
		 }
		 
		 System.out.println("");
		 System.out.println(tri[r-1][c-1]);
	}
	
	static int pascal(int r, int c) {
		if(r>0 && c >0) {
			tri[r][c] = pascal(r-1,c) + pascal(r,c-1);
		}else if(r == 0) {
			tri[r][c] = 1;
		}else if(c == 0) {
			tri[r][c] = 1;
		}
		return tri[r][c];
	}
}
