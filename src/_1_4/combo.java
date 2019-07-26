/*
ID: juliajung
LANG: JAVA
TASK: combo
*/
package _1_4;
import java.io.*;
import java.util.*;

public class combo {
	static Scanner in;
	static PrintWriter out;
	static int N, a1, a2, a3, b1, b2, b3, count;
	
	
	//static StringBuilder result;

	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("combo.in"));
			out = new PrintWriter(new File("combo.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			N = in.nextInt();
			a1 = in.nextInt();
			a2= in.nextInt();
			a3= in.nextInt();
			b1= in.nextInt();
			b2= in.nextInt();
			b3= in.nextInt();
			count = 0;
		}
		public static int solve() {
			
			for(int i =1; i <=N; i++) {
				for(int j =1; j<= N; j++) {
					for(int k =1; k<=N; k++) {
						if(totalMatch(i,j,k,a1,a2,a3))
							count++;
						else if(totalMatch(i,j,k,b1,b2,b3))
							count++;
					}
				}
			}
			
			return count;
			
		}
		private static boolean totalMatch(int a, int b, int c, int a1, int a2, int a3) {
			return isMatch(a,a1) && isMatch(b,a2) && isMatch(c,a3);
			
		}


		private static boolean isMatch(int a, int b) {
			return (Math.abs(a-b) <=2) || (Math.abs(a-b) >= N-2);

		}

}
