package jan2019;

import java.util.*;
import java.io.*;

public class sleepy {
	
	static Scanner in;
	static PrintWriter out;
	static int N, count;
	static int[] ary;
	
	public static void main(String args[]) {
		
		try {
			in = new Scanner (new File("sleepy.in"));
			out = new PrintWriter(new File("sleepy.out"));
			
			init();
			
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		N= in.nextInt();
		ary= new int [N];
		count = 0;
		
		for(int i =0; i < N; i++) {
			ary[i] = in.nextInt();
		}
	}
	
	private static int solve() {
		for(int i = N-1; i>0; i--) {
			if(ary[i-1]>ary[i]) {
				count=i;
				break;
			}
		}
		return count;
	}

}
