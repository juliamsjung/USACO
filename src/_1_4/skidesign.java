/*
ID: juliajung
LANG: JAVA
TASK: skidesign
*/
package _1_4;
import java.io.*;
import java.util.*;

public class skidesign {
	static Scanner in;
	static PrintWriter out;
	static int N, ary[], min;
	
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("skidesign.in"));
			out = new PrintWriter(new File("skidesign.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			N= in.nextInt();
			ary = new int[N];
			for(int i =0; i < N;i++) {
				ary[i]= in.nextInt();
			}
			Arrays.sort(ary);
			min = Integer.MAX_VALUE;
			
		}
		public static int solve() {
			int end = ary[N-1]-17;
			
			for(int i = ary[0]; i<=end; i++) {
				int temp =0;
				for(int j =0; j< N; j++) {
					
					if(ary[j] > i+17)
						temp += (ary[j]-i-17) * (ary[j]-i-17);
					
					else if(ary[j] < i)
						temp += (ary[j] -i) * (ary[j] -i);
					
				
				}
				min = Math.min(min, temp);
			}
			return min;
		}

}
