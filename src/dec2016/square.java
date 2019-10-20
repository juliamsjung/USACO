//package dec2016;
import java.util.*;
import java.io.*;
public class square {
	
	static Scanner in;
	static PrintWriter out;
	static int[] x ,y;
	
	public static void main (String args[]) {
		
		try{
			in = new Scanner (new File("square.in"));
			out = new PrintWriter (new File("square.out"));
			
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
		x = new int[4];
		y = new int [4];
		for(int i =0; i < 4; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
	}
	
	private static int solve() {
		int xmax = 0;
		int xmin = Integer.MAX_VALUE;
		int ymax = 0;
		int ymin = Integer.MAX_VALUE;
		
		for(int i =0; i < 4; i++) {
			xmax = Math.max(x[i], xmax);
			ymax = Math.max(y[i], ymax);
			
			xmin = Math.min(x[i], xmin);
			ymin = Math.min(y[i], ymin);
		}
		
		int diffx = Math.abs(xmax-xmin);
		int diffy = Math.abs(ymax-ymin);
		
		if(diffx>= diffy) {
			return diffx*diffx;
		}
		else {
			return diffy*diffy;
		}
	}
}
