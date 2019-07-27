/*
ID: juliajung
LANG: JAVA
TASK: barn1
*/
package _1_4;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class barn1 {
	static Scanner in;
	static PrintWriter out;
	static int M, S, C, temp[];
	static ArrayList <Integer> list = new ArrayList<Integer>();
	
	
	//static StringBuilder result;
	static int result = 0;
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("barn1.in"));
			out = new PrintWriter(new File("barn1.out"));
			
			init();
			
			
			//write out file
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			M = in.nextInt();
			S = in.nextInt();
			C = in.nextInt();
			temp = new int[C];
			

			
		}
		public static int solve() {
			if(M>C) {
				return C;
			}
			for(int i =0; i < C; i++) {
				temp[i] = in.nextInt();
			}
			Arrays.sort(temp);
			
			for(int i = 1; i < temp.length; i++) {
				list.add(temp[i]-temp[i-1] -1);
			}
			
			Collections.sort(list, Collections.reverseOrder());
			
			result = temp[temp.length-1] - temp[0] +1;
			
			for(int i =0; i< M-1; i++) {
				result = result - list.get(i);
			}
			
			return result;
			
		}

}
