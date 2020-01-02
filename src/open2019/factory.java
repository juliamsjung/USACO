package open2019;
import java.io.*;
import java.util.*;
public class factory {
	
	static Scanner in;
	static PrintWriter out;
	static int[] enter, leave;
	static int N;
	
	
	public static void main(String args[]) {
		try {
			in = new Scanner (new File("factory.in"));
			out = new PrintWriter (new File("factory.out"));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		N = in.nextInt();
		enter = new int[N];
		leave = new int[N];
		
	}
	
	private static int solve() {
		for(int i =0; i < N-1; i++) {
			leave[in.nextInt()-1]++;
			enter[in.nextInt()-1]++;
		}
		int count = 0;
		int index =0;
		for(int i =0; i < N; i++) {
			if(leave[i] == 0) {
				count++;
				index = i;
			}
			if(count > 1) {
				return -1;
			}
		}
		index++;
		return index;
		
		
	}

}
