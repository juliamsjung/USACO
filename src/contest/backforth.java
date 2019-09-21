package contest;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class backforth {
	
	static Scanner in;
	static PrintWriter out;
	static int milk, res;
	static int[] a, b, a1, b1;
	static HashSet <Integer> amt;
	
	public static void main(String [] args) {
		try {
			in = new Scanner (new File("backforth.in"));
			out = new PrintWriter(new File("backforth.out"));
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
		a1 = new int [10];
		b1 = new int [10];
		a = new int[10];
		b = new int[10];
		amt = new HashSet<Integer>();
		
		for(int i =0; i < 10; i ++) {
			a1[i] = in.nextInt();
		}
		for(int i =0; i < 10; i ++) {
			b1[i] = in.nextInt();
		}
	}
	
	private static int solve() {
		
		for(int i =0; i<10;i++) {
			for(int j=0; j<10; j++) {
				a=a1.clone();
				b=b1.clone();
				
				milk= 1000-a[i] + b[j];
				
				int temp = a[i];
				a[i] = b[j];
				b[j] = temp;
				
				for(int k =0; k < 10;k++) {
					for(int m =0; m<10; m++) {
						res = milk - a[k] + b[m];
						amt.add(res);
					}
				}
			}
		}
		
		return amt.size();
	}

}
/*
1 1 1 1 1 1 1 1 1 2
5 5 5 5 5 5 5 5 5 5
*/
