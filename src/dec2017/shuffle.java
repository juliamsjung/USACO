//package dec2017;
import java.util.*;
import java.io.*;
public class shuffle {
	
	static Scanner in;
	static PrintWriter out;
	static int[] id, cow;
	static int x;
	
	public static void main(String args[]) {
		
		try {
			in = new Scanner (new File("shuffle.in"));
			out = new PrintWriter (new File("shuffle.out"));
			
			init();
			solve();
			for(int i =0; i < x; i++) {
				out.println(cow[i]+1);
			}
			
			in.close();
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		x = in.nextInt();
		id = new int[x];
		cow = new int [x];
		
		for(int i =0; i < x; i++) {
			id[i] = in.nextInt()-1;
		}
		
		for(int i =0; i < x; i++) {
			cow[i] = in.nextInt()-1;
		}
	}
	
	private static void solve() {
		shuffle();
		shuffle();
		shuffle();
	}
	
	private static void shuffle() {
		int[] temp = new int[x];
		
		for(int i =0; i < x; i++) {
			temp[i] = cow[id[i]];
		}
		
		for(int i =0; i< x; i++) {
			cow[i] = temp[i];
		}
	}

}
