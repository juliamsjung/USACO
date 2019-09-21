package dec2018;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class blist {
	
	static Scanner in;
	static PrintWriter out;
	static int N, si, ti, bi;
	static int[] ary;
	
	public static void main(String[] args) {
		try {
			in = new Scanner (new File("blist.in"));
			out = new PrintWriter(new File("blist.out"));
			init();
			out.println(solve());
			out.close();
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		ary = new int[1001];
		N = in.nextInt();
	}
	
	private static int solve() {
		for(int i =0; i < N; i++) {
			si = in.nextInt();
			ti = in.nextInt();
			bi = in.nextInt();
			
			for(int s =si; s<= ti; s++) {
				ary[s] += bi;
			}
		}
		Arrays.sort(ary);
		return ary[1000];
	}
/*
3
4 10 1
8 13 3
2 6 2
 */
	

}
