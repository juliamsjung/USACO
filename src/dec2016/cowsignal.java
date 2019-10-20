//package dec2016;
import java.util.*;
import java.io.*;
public class cowsignal {
	
	static Scanner in;
	static PrintWriter out;
	static int M,N,K;
	static String[] ary, res;
	
	public static void main(String args[]) {
		try {
			in = new Scanner (new File("cowsignal.in"));
			out = new PrintWriter(new File("cowsignal.out"));
			
			init();
			solve();
			for(int i =0; i < M; i++) {
				for(int j =0; j < K; j++) {
					out.println(res[i]);
				}
			}
			
			in.close();
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		M = in.nextInt();
		N = in.nextInt();
		K = in.nextInt();
		in.nextLine();
		
		ary = new String[M];
		res = new String[M];
		
		for(int i =0; i < M; i++) {
			ary[i] = in.nextLine();
			res[i] = "";
		}
		
		
	}
	
	private static void solve() {
		for(int i =0; i < M; i++) {
			for(int k =0; k<N; k++) {
				for(int j =0; j < K; j++) {
					res[i] += ary[i].charAt(k);
				}
			}
		}
		//System.out.println(Arrays.toString(res));
	}
}
