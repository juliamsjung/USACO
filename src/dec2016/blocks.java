package dec2016;
import java.io.*;
import java.util.*;
public class blocks {
	
	static Scanner in;
	static PrintWriter out;
	static int[] abc;
	static int N;
	
	public static void main (String args[]) {
		
		try {
			in = new Scanner (new File("blocks.in"));
			out = new PrintWriter(new File ("blocks.out"));
			
			init();
			solve();
			
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
		abc = new int[26];
		
		
	}
	
	private static void solve() {
		for(int i =0; i < N; i++) {
			int[] f = new int [26];
			int[] s = new int [26];
			
			String first = in.next();
			String second = in.next();
			
			
			for(int j =0; j < first.length(); j++) {
				int n = first.charAt(j)-'a';
				f[n]++;
			}
			for(int k =0; k < second.length(); k++) {
				int m = second.charAt(k) -'a';
				s[m]++;
			}
			//System.out.println(first + " " + Arrays.toString(f));
			//System.out.println(second + " " + Arrays.toString(s));
			
			//get most for each letter and add it to abc
			for(int x=0; x< 26; x++) {
				if(f[x] >= s[x]) {
					abc[x] += f[x];
				}else {
					abc[x] += s[x];
				}
			}
		}
	}

}
