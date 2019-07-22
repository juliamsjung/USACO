/*
ID: juliajung
LANG: JAVA
TASK: ride
*/
package _1_3;
import java.io.*;
import java.util.*;

public class milk2 {
	
	static BufferedReader in;
	static PrintWriter out;
	static int N,f[];
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new BufferedReader(new FileReader("milk2.in"));
			out = new PrintWriter(new File("milk2.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() throws IOException{
			//get data
			//initialize input variable
			N =  Integer.parseInt(in.readLine());
			pair f[] = new pair[N];
			
			
			for( int i =0; i < N; i ++) {
				String s=in.readLine();				
				StringTokenizer st = new StringTokenizer(s);
				f[i] = new pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(f);
		}
			
		
		public static String solve() {
			//process and output
			
			return result;
			
		}
		

}
class pair implements Comparable<pair>{
	int s;
	int e;
	public pair(int s1, int e1) {
		s = s1;
		e = e1;
	}
	public int compareTo(pair that) {
		return this.s - that.s;
	}
	
}
