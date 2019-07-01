
/*
ID: juliajung
LANG: JAVA
TASK: gift1
*/
package _1_2;
import java.io.*;
import java.util.*;

public class gift1 {
	static Scanner in;
	static PrintWriter out;
	
	
	
	//static StringBuilder result;
	
	static int n;
	static Map <String, Integer> m;
	
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
			m = new LinkedHashMap<String, Integer>();
			
			for( int i =0; i < n; i++) {
				m.put(in.next(),0);
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
				
				m.put(giver, m.get(giver)-money + r);
				
				for( int i =0; i < d; i++) {
					String people = in.next();
					m.put(people, m.get(people)+gift);
				}
				
				
				
				//System.out.println(giver);
				//System.out.println(money);
				//System.out.println(d);
				
			}
			
			StringBuilder st = new StringBuilder();
			for(String name : m.keySet()) {
				st.append(name).append(" ").append(m.get(name)).append("\n");
				
			}
			
			return st.toString();
			
		}
		

}
