package dec2016;
import java.io.*;
import java.util.*;
public class blocks {
	
	static Scanner in;
	static PrintWriter out;
	static int[] abc;
	static String[] a,b;
	static int N;
	
	public static void main (String args[]) {
		
		try {
			in = new Scanner (new File("blocks.in"));
			out = new PrintWriter(new File ("blocks.out"));
			
			init();
			for(int i =0; i < 26; i++) {
				out.println(abc[i]);
			}
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void init() {
		N = in.nextInt();
		a = new String[N];
		b = new String[N];
		abc = new int[26];
		
		for(int i =0; i < N; i++) {
			a[i] = in.next();
			b[i] = in.next();
		}
		//System.out.println(Arrays.toString(a));
		//System.out.println(Arrays.toString(b));
	}
	
	private static void solve() {
		for(int i =0; i < N; i++) {
			for(int j =0; j < N; j++) {
				
			}
		}
	}

}
