/*
ID: juliajung
LANG: JAVA
TASK: wormhole
*/
package _1_4;
import java.io.*;
import java.util.*;

public class wormhole {
	static Scanner in;
	static PrintWriter out;
	static int [] pair, x, y, hasRight;
	static int N;
	
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("wormhole.in"));
			out = new PrintWriter(new File("wormhole.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			//get data
			//initialize input variable
			
			N = in.nextInt();
			x = new int [N+1];
			y = new int [N+1];
			pair = new int [N+1];
			hasRight = new int [N+1];
			
			for(int i =1; i <= N; i++) {
				x[i]  = in.nextInt();
				y[i]  = in.nextInt();
			}
			
			for(int i =1; i <= N; i++) {
				for(int j =1; j<=N; j++) {
					if(x[j] > x[i] && y[j] == y[i]) {
						if(hasRight[i] == 0 || x[j] - x[i] < x[hasRight[i]]- x[i]) {
							hasRight[i] = j;
						}
					}
				}
			}

			
		}
		public static String solve() {
			String result = "";
			result = "" + recurr();
			return result;
			
		}
		
		private static int recurr() {
			int total =0;
			
			int i =0;
			
			for(i =1; i<=N; i++) {
				if(pair[i] ==0)
					break;
			}
			if(i>N) {
				if(isCycle())
					return 1;
				else
					return 0;
			}
			
			for( int j = i+1; j <= N; j++) {
				
				if(pair[j] == 0) {
					pair[i] = j;
					pair[j] = i;
					total += recurr();
					pair[i] = pair[j] = 0;
				}
			}
			return total;
		}
		
		public static boolean isCycle() {
			for(int start =1; start <=N; start++) {
				int pos = start;
				for(int count =1; count < N; count++) {
					pos = hasRight[pair[pos]];
				}
				if(pos !=0)
					return true;
			}
			return false;
		}

}
