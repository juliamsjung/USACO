/*
ID: juliajung
LANG: JAVA
TASK: crypt1
*/
package _1_2;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class crypt1 {
	static Scanner in;
	static PrintWriter out;
	static ArrayList <Integer> a = new ArrayList <Integer>();
	static int N, count, x[], y[], p1, p2, p3;
	
	
	
	//static StringBuilder result;
	
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("crypt1.in"));
			out = new PrintWriter(new File("crypt1.out"));
			
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
			for(int i = 0; i < N; i++) {
				a.add(in.nextInt());
			}
			x = new int [N*N*N];
			y = new int [N*N];
			count  =0;
			
		}
		public static int solve() {
			
			for(int i =0; i < N; i++) {
				
				for(int j = 0; j < N; j++ ) {
					
					for(int k =0; k < N; k++) {
						x[i] = (a.get(i) * 100) + (a.get(j) * 10) + (a.get(k));
						
						if(i==0) 
							y[i] = a.get(j)*10 + a.get(k);
						
						p1 = x[i] * (y[i]%10);
						p2 = x[i] * (y[i]/10);
						p3 = p1 + (p2 *10);
						
						if((p1+"").length() !=3 || (p2+"").length() !=3)
							continue;
						else {
							if(isValid(p1) && isValid(p2) && isValid(p3))
								count++;
						}
					}
				}
			}
			
			return count;
			
		}
		static boolean isValid (int n) {
			boolean chk = true;
			for(int i = 0; i < (n+"").length(); i++) {
			
				if(a.indexOf(Integer.parseInt((n+"").substring(i,i+1)))<0) {
					chk=false;
					break;
				}

				
			}
			return chk;
		}

}


