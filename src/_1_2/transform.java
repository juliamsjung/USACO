/*
  ID: juliajung
  LANG: JAVA
  TASK: transform
 */
package _1_2;
import java.io.*;
import java.util.*;

public class transform {
	static Scanner in;
	static PrintWriter out;
	static int n;
	static char[][] f, N;
	
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("transform.in"));
			out = new PrintWriter(new File("transform.out"));
			
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
			n = in.nextInt();
			in.nextLine();
			f = new char[n][n];
			N = new char[n][n];
			
			for(int i =0; i < n;i++) {
				String input = in.nextLine();
				for(int j=0; j<n;j++) {
					f[i][j]=input.charAt(j);
					//System.out.print(f[i][j]);
				}
				//System.out.println("");
			}
			for(int i =0; i < n;i++) {
				String input = in.nextLine();
				for(int j=0; j<n;j++) {
					N[i][j]=input.charAt(j);
					//System.out.print(N[i][j]);
				}
				//System.out.println("");
			}
			
			
		}
		public static int solve() {
			//process and output
			boolean check = true;
			//check for unchanged
			
				if(isSame(_90(f)))
					return 1;
				else if(isSame(_180(f)))
					return 2;
				else if(isSame(_270(f)))
					return 3;
				else if(isSame(reflect(f)))
					return 4;
				else if(isSame(reflect(_90(f)))||isSame(reflect(_180(f)))||isSame(reflect(_270(f))))
					return 5;
				else if(isSame(f))
					return 6;
				else
					return 7;
			
			
			
			
		}
		static char[][] _90 (char[][] in) {
			char[][] res = new char[n][n];
			
			for(int i =0; i <n; i++) {
				for(int j=0; j < n; j++) {
					res[i][j] = in[n-j-1][i];
				}
			}
			return res;
			
		}
		static char[][] _180 (char[][] in){
			return _90(_90(f));
		}
		static char[][] _270 (char[][]in){
			return _90(_180(f));
		}
		static char[][] reflect (char[][]in) {
			char[][] res = new char [n][n];
			
			for(int i =0; i < n; i++) {
				for(int j=0; j<n; j++) {
					res[i][j]= in[i][n-j-1];
				}
			}
			return res;
		}
		private static boolean isSame(char[][]in) {
			
			for(int i =0; i< n; i++) {
				for(int j =0; j < n; j++) {
					if(in[i][j] != N[i][j])
						return false;
				}
			}
			return true;
		}
		

}



