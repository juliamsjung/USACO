/*
ID: juliajung
LANG: JAVA
TASK: gift1
*/
//package _1_2;
import java.io.*;
import java.util.*;

public class gift1 {
	static Scanner in;
	static PrintWriter out;
	
	
	
	//static StringBuilder result;
	
	static int n, m[] ;
	static String name[];
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("gift1.in"));
			out = new PrintWriter(new File("gift1.out"));
			
			init();
			
			//write out file
			out.print(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			//get data
			//initialize input variable
			
			n = in.nextInt();
			name = new String [n];
			m = new int [n];
			
			for( int i =0; i < n; i ++) {
				name[i]=in.next();
				m[i]= 0;
			}
			
			//System.out.println(Arrays.toString(name));
			//System.out.println(Arrays.toString(m));

			
		}
		public static String solve() {
			//process and output
			for(int x = 0; x < n; x++) {
				String giver = in.next();
				int money = Integer.parseInt(in.next());
				int d = Integer.parseInt(in.next());
				if(d ==0) {
					continue;
				}
				int gift = money /d;
				int r = money%d;
				int index = find(giver);
				
				
				m[index] = m[index] - money + r;
				for( int i =0; i < d; i++) {
					index = find(in.next());
					m[index] += gift;
				}
				
				//System.out.println(giver);
				//System.out.println(money);
				//System.out.println(d);
				
			}
			
			StringBuilder st = new StringBuilder();
			for(int i =0; i < n;i++) {
				st.append(name[i]).append(" ").append(m[i]).append("\n");
				
			}
			
			return st.toString();
			
		}
		static int find (String s) {
			int index =0;
			for(int i =0; i < n; i++) {
				if(s.equals(name[i])) {
					index = i;
					break;
				}
			}
			return index;
		}

}
