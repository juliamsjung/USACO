/*
  ID: juliajung
  LANG: JAVA
  TASK: dualpal
 */

package _1_2;
import java.io.*;
import java.util.*;

public class dualpal {
	static Scanner in;
	static PrintWriter out;
	static int N , S;
	
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("dualpal.in"));
			out = new PrintWriter(new File("dualpal.out"));
			
			init();
			
			
			//write out file
			out.print(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			//get data
			//initialize input variable
			N = Integer.parseInt(in.next());
			S = Integer.parseInt(in.next());
			

			
		}
		public static String solve() {
			//process and output
			
			int count =0;
			
			S++;
			while(count < N) {
				
					int countpal =0;
					
					for(int j = 2; j<=10; j++) { //bases
						String op = "" + S;
						String n = baseConversion(op, 10, j);
						
						if(isPalindrome(n)==true) {
							countpal++;
						}
						
						if(countpal >= 2) {
							count++;
							result += op + "\n";
							break;
						}
					}
					
					S++;
			}
			
			return result;
			
		}
		static boolean isPalindrome(String c) {
			
			int idx = c.length() -1;
			for(int i = 0; i < c.length() /2; i++) {
				if(c.charAt(i) != c.charAt(idx)) 
					return false;
				idx--;
			}
			return true;
		}
		static String baseConversion(String number, int sBase, int dBase) {
			return Integer.toString(Integer.parseInt(number, sBase), dBase);
		}
		

}

