/*
ID: juliajung
LANG: JAVA
TASK: milk
*/
package _1_2;
import java.io.*;
import java.util.*;

public class milk {
	static Scanner in;
	static PrintWriter out;
	
	static int M, N, total;
	static farmer[] list;
	
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("milk.in"));
			out = new PrintWriter(new File("milk.out"));
			
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
			M = in.nextInt();
			total = 0;
			//System.out.println(N + " " + M);
			
			list = new farmer [M];
			for(int i =0; i < M; i++) {
				list[i] = new farmer(in.nextInt(), in.nextInt());
			}
			Arrays.sort(list);
			
			
		}
		public static int solve() {
			//process and output
			
			for(int i =0; i < M; i++) {
				if( list[i].amount<= N) {	
					N = N - list[i].amount;
					total = total + (list[i].price*list[i].amount);
				}else {
					total = total + (N*list[i].price);
					break;
				}
				
				
			}
			return total;
			
		}

		
		static class farmer implements Comparable<farmer>{
			
			int price;
			int amount;
			
			public farmer(int p, int a) {
				price = p;
				amount = a;
			}
			
			@Override
			public int compareTo(farmer that) {
				return this.price - that.price;
			}
			
			
		}
}
