/*
ID: juliajung
LANG: JAVA
TASK: ride
*/
package _1_2;
import java.io.*;
import java.util.*;

public class friday {
	static Scanner in;
	static PrintWriter out;
	static int m[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static int day,n,d[];

	
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("friday.in"));
			out = new PrintWriter(new File("friday.out"));
			
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
			
			day =0;
			d = new int [7];
			n=in.nextInt();
			

			
		}
		public static String solve() {
			//process and output
			
			
			for(int i =1900; i < i+n;i++) {
				for(int j = 1; j <=12; j++) {
					int date = (day + 13) %7;
					d[date]++;
					day+= m[j];
					if(j==2 && isLeap(i))
						day++;
				}
			}
			String result = Integer.toString(m[6]);
			for(int i =0; i<5; i++) {
				result+= " " + Integer.toString(m[i]);
			}
			return result;
			
		}
		
		static boolean isLeap(int y) {
			if(y %4==0 && y%100 !=0 || y%400==0) {
				return true;
			}else {
				return false;
			}
		}

}

