/*
ID: juliajung
LANG: JAVA
TASK: beads
*/
package _1_2;
import java.io.*;
import java.util.*;

public class beads{

   static Scanner in;
   static PrintWriter out;
   static String[] list;
   static int N;
   static String beads;

   
   public static void main(String[] args) {

      try {

         // initialize in & out
         in = new Scanner(new File("beads.in"));
         out = new PrintWriter(new File("beads.out"));

         init();

         // write out file
         out.print(solve());

         out.close();
         in.close();

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   private static void init() {

      // get data
      // initialize input variables
      N = Integer.parseInt(in.nextLine());
      beads = in.nextLine();

   }

   private static String solve() {

      // process and output
      String result = "";
      int max = 0;
      beads += beads;

      for (int i = 0; i < beads.length() / 2; i++) {

         int c = 1;
         char start = beads.charAt(i);

         if (start == 'w')
            c = Math.max(recur(i, 'r'), recur(i, 'b'));
         else
            c = recur(i, start);

         if (max < c)
            max = c;

      }

      result += max + "\n";
      return result;

   }

   private static int recur(int i, char c) {

      boolean flag = false;
      int idx = i + 1;
      int count = 2; 

      while (count < beads.length() / 2) {

         char curr = beads.charAt(idx);

         if (!flag) {
            if (curr == c || curr == 'w')
               count++;
            else
               flag = true;

         } else {
            if (curr != c || curr == 'w')
               count++;
            else
               break;
            
         }
         idx++;
      }
      return count;
   }


}