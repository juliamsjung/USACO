/*
  ID: juliajung
  LANG: JAVA
  TASK: ride
 */
import java.io.*;
import java.util.*;

public class template {
	static Scanner in;
	static PrintWriter out;
	
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("xxx.in"));
			out = new PrintWriter(new File("xxx.out"));
			
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

			
		}
		public static String solve() {
			//process and output
			
			return result;
			
		}

}
