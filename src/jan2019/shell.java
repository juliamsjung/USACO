package jan2019;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

class shell {
	
	static Scanner in;
	static PrintWriter out;
	static int N, a, b, g;
	static int[] ary, ans, res;
	
	public static void main(String [] args) {
		
		try {
			in = new Scanner(new File("shell.in"));
			out = new PrintWriter(new File("shell.out"));
			
			init();
			
			out.println(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		
		}
	}
	
	private static void init() {
		N = in.nextInt();
		ary = new int[] {0,1,2,3};
		ans = new int[N];
		res = new int[3];
		
	}
	
	private static int solve() {
		
		for(int i =0; i < N; i++) {
			a = in.nextInt();
			b = in.nextInt();
			g = in.nextInt();
			int tempA = ary[a];
			
			ary[a] = ary[b];
			ary[b] = tempA;
			ans[i] = ary[g];
			
			//System.out.println(ary[1] + " " + ary[2] + " " + ary[3]);
			
			if(ans[i] == 1) {
				res[0]++;
			}else if(ans[i] ==2) {
				res[1]++;
			}else{
				res[2]++;
			}
		}
		
		Arrays.sort(res);
		return res[2];
	}

}
