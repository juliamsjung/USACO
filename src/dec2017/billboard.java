package dec2017;
import java.util.*;
import java.io.*;
public class billboard {
	
	static Scanner in;
	static PrintWriter out;
	static int[] a,b,c;
	static boolean[][] ary;
	static int score;
	
	public static void main(String args[]) {
		
		try {
			in = new Scanner(new File("billboard.in"));
			out = new PrintWriter(new File("billboard.out"));
			
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
		a = new int[4];
		b = new int[4];
		c = new int[4];
		ary = new boolean[2001][2001];
		
		for(int i =0; i < 4; i++) {
			a[i] = in.nextInt() + 1000;
		}
		for(int i =0; i < 4; i++) {
			b[i] = in.nextInt() + 1000;
		}
		for(int i =0; i < 4; i++) {
			c[i] = in.nextInt() + 1000;
		}

	}
	
	private static int solve() {
		for(int i = a[0]; i < a[2]; i++) {
			for(int j =a[1]; j < a[3]; j++) {
				ary[i][j] = true;
				score ++;
			}
		}
		for(int i = b[0]; i < b[2]; i++) {
			for(int j =b[1]; j < b[3]; j++) {
				ary[i][j] = true;
				score ++;
			}
		}
		for(int i = c[0]; i < c[2]; i++) {
			for(int j =c[1]; j < c[3]; j++) {
				if(ary[i][j]) {
					score--;
				}
			}
		}
		return score;
		
	}

}
