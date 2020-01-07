package feb2019;
import java.io.*;
import java.util.*;
public class herding {
	
	static Scanner in;;
	static PrintWriter out;
	static int a , b, c;
	static int min, max;

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("herding.in"));
			out = new PrintWriter(new File("herding.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() {
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		min = 0;
		max = 0;
	}
	
	
	private static void solve() {
		int x = Math.abs(a-b);
		int y = Math.abs(b-c);
		
		if(x == 2 || y ==2) 
			min = 1;
		else if(x==1 && y==1)
			min =0;
		else
			min = 2;
		
		//System.out.println(x + " " + y);
		
		max = Math.max(x, y) -1;
		
		out.println(min);
		out.println(max);
	}

}
