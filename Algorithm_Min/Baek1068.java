package 알고_민규;

import java.util.ArrayList;
import java.util.Scanner;
public class Baek1068 {
   static ArrayList<ArrayList<Integer>> ad_list = new ArrayList<ArrayList<Integer>>();
   static boolean[] visit;
   static int root;
   static int goal;
   static int count=0;
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       visit = new boolean[N];
       for(int i = 0 ; i < N ; i++) ad_list.add(new ArrayList<Integer>());
       for(int i = 0 ; i < N ; i++) {
          int a = sc.nextInt();
          if(a == -1) {
             root = i;
             continue;
          }
          
          ArrayList<Integer> tmp=ad_list.get(a);
          tmp.add(i);
       }
       goal = sc.nextInt();

       if(root == goal) {
          System.out.println(0);
          return;
       }
       
       breaking(root,false);
       
//       for(int i = 0 ; i < N ; i++) {
//          System.out.println(ad_list.get(i));
//       }
       
       chcking(root);
       
       System.out.println(count);
    }
    public static void breaking(int g,boolean check) {
       ArrayList<Integer> list = ad_list.get(g);
       for(int i = 0 ; i < list.size() ; i++) {
          int a = list.get(i);
          if(g == goal || check) {
             ad_list.set(g,new ArrayList<Integer>());
             breaking(a,true);
          }else {
             breaking(a,false);
          }
       }
    }
    public static void chcking(int g) {
    	
       ArrayList<Integer> list = ad_list.get(g);
       if(list.size() == 0 && g!=goal) {
          //System.out.println(g);
          count++;
       }
       else {
          for(int i = 0 ; i < list.size() ; i++) {
              int a = list.get(i);
              chcking(a);
           }
       }
    }
//    public static void chcking(int g) {
//        ArrayList<Integer> list = ad_list.get(g);
//        if(list.size() == 0 && g!=goal) {
//           //System.out.println(g);
//           count++;
//        }
//        else {
//           for(int i = 0 ; i < list.size() ; i++) {
//               int a = list.get(i);
//               chcking(a);
//            }
//        }
//     }
}