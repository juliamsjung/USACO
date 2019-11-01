//package jan2017;
import java.io.*;
import java.util.*;
public class hps {
	
	static Scanner in;
	static PrintWriter out;
	static int N, count, ans, total;
	static int[] f, s;
	
	public static void main (String args[]) {
		
		try {
			in = new Scanner (new File ("hps.in"));
			out = new PrintWriter ( new File ("hps.out"));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		N = in.nextInt();
		f = new int[N];
		s = new int[N];
		total =N;
		
		for(int i =0; i < N; i++) {
			f[i] = in.nextInt();
			s[i] = in.nextInt();
		}
		
	}
	
	private static int solve() {
		
		//pretend 1 = rock, 2 = paper, 3 = scissors
		
		for(int i =0; i < N; i++) {
			
			//check ties, then subtract from N
			if(f[i] == s[i]) {
				total--;
			}
			
			//check all the times it wins
			else if(f[i] == 1 && s[i] ==3) count++;
			
			else if(f[i] == 2 && s[i] ==1) count++;
			
			else if(f[i] == 3 && s[i] ==2) count++;
		}
		
		System.out.println(total);
		ans= Math.max(count, total-count);
		return ans;
		
	}

}
