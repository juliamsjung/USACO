
package dec2018;
import java.io.*;
import java.util.*;

public class mixmilk {
	static Scanner in;
	static PrintWriter out;
	static int[] max, m;
	
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("mixmilk.in"));
			out = new PrintWriter(new File("mixmilk.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			max = new int [3];
			m = new int [3];
			max[0] = in.nextInt();
			m[0] = in.nextInt();
			max[1] = in.nextInt();
			m[1] = in.nextInt();
			max[2] = in.nextInt();
			m[2] = in.nextInt();
			
			
		}
		public static String solve() {
			for(int i =0; i < 100; i++) {
				minseobabo(0,1);
				i++;
				if(i==100)
					break;
				minseobabo(1,2);
				i++;
				if(i==100)
					break;
				minseobabo(2,0);
			
				 
			}	
			
			return m[0] + "\n" + m[1] + "\n" + m[2];
			

			
		}
		public static void minseobabo (int a , int b ) {
			if(m[a] + m[b] > max[b]) {
				m[a] -= max[b] - m[b];
				m[b] += max[b] - m[b];
			}
			else {
				m[b] += m[a];
				m[a] = 0;
			}
		}
/*
10 3
11 4
12 5
 */

}
