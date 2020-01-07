package feb2018;
import java.io.*;
import java.util.*;
public class teleport {
	
	static Scanner in;
	static PrintWriter out;
	static int a, b, x, y;

	public static void main(String[] args) {
		
		try{
			in = new Scanner (new File("teleport.in"));
			out = new PrintWriter(new File("teleport.out"));
			
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
		x = in.nextInt();
		y = in.nextInt();
	}
	
	private static void solve() {
		int point = Math.min(a, b);
		int tele = Math.min(x, y);
		int point1 = Math.max(a, b);
		int tele1 = Math.max(x, y);
		int length = Math.abs(a-b);
		
		int res1 = Math.abs(tele - point);
		int res2 = Math.abs(point1 - tele1);
		
		int ans = Math.min(res1+res2, length);
		out.println(ans);
	}

}
