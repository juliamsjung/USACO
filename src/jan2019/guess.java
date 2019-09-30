package jan2019;
import java.util.*;
import java.io.*;
public class guess {
	
	static Scanner in;
	static PrintWriter out;
	static int N,k,same,max;
	static ArrayList<String> a[];
	
	public static void main(String args[]) {
		
		try {
			in = new Scanner(new File("guess.in"));
			out = new PrintWriter(new File("guess.out"));
			
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
		a= new ArrayList [N];
		max= 0;
		same =0;
		
		for(int i =0; i < N; i++) {
			a[i] = new ArrayList<String>();
			in.next();
			k = in.nextInt();
			for(int j=0; j<k;j++) {
				a[i].add(in.next());
			}
		}
		
		//System.out.println(Arrays.toString(a));
	}
	
	private static int solve() {
		
		for(int i =0; i <N-1; i++) {
			for(int j =i+1; j<N;j++) {
				for(String c: a[i]) {
					if(a[j].contains(c))
						same++;
				}
				max = Math.max(same, max);
				same=0;
			}
		}
		return max+1;
	}

}
