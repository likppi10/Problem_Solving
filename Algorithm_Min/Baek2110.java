package 알고_민규;

import java.util.Arrays;
import java.util.Scanner;

public class Baek2110 {
   static int N,C;
   static int[] arr;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      C=sc.nextInt();
      arr = new int[N+1];
      for(int i = 1 ; i <= N  ; i ++) {
         arr[i] = sc.nextInt();
      }
      Arrays.sort(arr,1,N+1);
      int L=1,R=100000000, result=0;
      while(L <= R) {
         int mid = (L+R)/2;
         if(search(mid)) {
            result = mid;
            L = mid +1;
         }else {
            R = mid-1;
         }
      }
      System.out.println(result);
   }
   public static boolean search(int D) {
      int count = 1,last = arr[1];
      for(int i = 2; i <= N ; i++) {
         if(arr[i] - last < D) continue;
         last = arr[i];
         count++;
      }
      if(count >= C) {
         return true;
      }else {
         return false;
      }
   }
}
