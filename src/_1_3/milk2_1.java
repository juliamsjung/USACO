/*
  ID: juliajung
  LANG: JAVA
  TASK: milk2
 */

package _1_3;
import java.io.*;
import java.util.*;

public class milk2_1 {
	static BufferedReader in;
	static PrintWriter out;
	static boolean m[];
	static int max,N,f[],gap,milk,maxGap,maxMilk, min=Integer.MAX_VALUE;
	
	
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
		
	}
		
		private static void init() throws IOException {
			//get data
			//initialize input variable
			
			N = Integer.parseInt(in.readLine());
			//System.out.println(N);
			f = new int [N*2];
			for(int i =0; i< N*2; i+=2) {
				String s=in.readLine();				//System.out.println(s);

				StringTokenizer st = new StringTokenizer(s);
				f[i] = Integer.parseInt(st.nextToken());
				min = Math.min(min, f[i]);
				
				f[i+1]= Integer.parseInt(st.nextToken());
				max = Math.max(max, f[i+1]);
				//System.out.println(f[i] + " " + f[i-1]);
			}
			
			m = new boolean[max + 1];
			
			
			
		}
		public static String solve() {
			//process and output
			for(int i =0; i <f.length;i+=2) {
				for(int x =f[i]; x< f[i+1]; x++) {
					m[x] = true;
					
				}
			}
			//System.out.println(Arrays.toString(m));
			for(int i =min; i <max;i++) {
				if(!m[i]) {
					
					
					gap++;
					milk = 0;
				}else {
					milk++;
					
					gap =0;
				}
				maxMilk = Math.max(maxMilk, milk);maxGap= Math.max(maxGap, gap);
				//System.out.println (i+" " + m[i]+" " + milk + " "+gap);
			}
			return maxMilk + " " + maxGap;
			
		}

}
