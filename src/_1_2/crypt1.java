/*
ID: juliajung
LANG: JAVA
TASK: crypt1
*/
//package _1_2;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class crypt1 {
	static Scanner in;
	static PrintWriter out;
	static ArrayList <Integer> a = new ArrayList <Integer>();
	static int N, count, p1, p2, p3;
	static int x, y;
	static String line;

	
	
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
				int t = in.nextInt();
				a.add(t);
				line += "" + t;
			}
			
			count  =0;
			
		}
		public static int solve() {
			
			for(int i =0; i < N; i++) {
				
				for(int j = 0; j < N; j++ ) {
					
					for(int k =0; k < N; k++) {
						
						for(int m =0; m < N; m++) {
							
							for(int h =0; h < N; h++) {
								x = (a.get(i) * 100) + (a.get(j) * 10) + (a.get(k));
								
								
								p1 = x * a.get(m);
								p2 = x * a.get(h);
								p3 = p1 + (p2 *10);
								
								
								
								if(checkAll(p1) && checkAll(p2) && isValid(p3)) 
									count++;
							}
						}
						
						
						
					}
				}
			}
			
			return count;
			
		}
		static boolean checkAll(int n) {
			return checkLength(n) && isValid(n);
		}
		
		static boolean checkLength(int n) { //checking length
			if((n+"").length() !=3) {
				return false;
			}
			return true;
		}
		
		static boolean isValid (int n) { //checking if it's in the arraylist
			String temp = "" + n;
			
			for(int i = 0; i < (n+"").length(); i++) {
			
				String c = "" + temp.charAt(i);
				if(!line.contains(c))
					return false;
				
			}
			return true;
		}
		

}


