package open2017;
import java.io.*;
import java.util.*;
public class lostcow {
	
	static Scanner in;
	static PrintWriter out;
	static int x, y, move;
	static int[] a;

	public static void main(String[] args) {
		try{
			in = new Scanner (new File("lostcow.in"));
			out = new PrintWriter(new File("lostcow.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	private static void init() {
		x = in.nextInt();
		y = in.nextInt();
		a = new int[20];
		
		int c = 1;
		for(int i =0; i < 20; i++) {
			a[i] = c;
			c = c * -2;
		}
		
		//System.out.println(Arrays.toString(a));
	}
	
	private static void solve() {
		
		for(int i =0; i < 20; i++) {
			
			//System.out.println(move);
			
			if(i != 0) {
				move += Math.abs(a[i-1]);
				
			}
			
			if(a[i] + x == y) {
				move += Math.abs(a[i]);
				break;
			}else if(x > y) {
				if(a[i] + x < y) {
					move += x - y;
					//System.out.println("in");
					break;
				}else {
					move += Math.abs(a[i]);
					//System.out.println("in");
				}
			}else {
				if(a[i] + x > y) {
					move += y - x;
					break;
				}else {
					move += Math.abs(a[i]);
				}
			}
			
			
		}
		
		out.println(move);
	}

}
