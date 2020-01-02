package open2019;
import java.io.*;
import java.util.*;
public class buckets {
	
	static Scanner in;
	static PrintWriter out;
	static int Bx, By, Rx, Ry, Lx, Ly, res;
	static char[][] a;
	

	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("buckets.in"));
			out = new PrintWriter(new File("buckets.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		a = new char[10][10];
		
		for(int i =0; i < 10; i++) {
			a[i] = in.nextLine().toCharArray();
		}
		
		for(int i =0; i < 10;i++) {
			for(int j =0; j < 10; j++) {
				
				if(a[i][j] == 'B') {
					Bx = i;
					By = j;
				}
				else if(a[i][j] == 'R') {
					Rx = i;
					Ry =j;
				}else if(a[i][j] == 'L') {
					Lx = i;
					Ly =j;
				}
				
			}
		}
	}
	
	private static void solve() {
		
		res = Math.abs(Bx-Lx) + Math.abs(By-Ly)-1;
		
		//exception cases:
		if(Bx == Rx && Bx == Lx) {
			if(Ry > By && Ry < Ly || Ry < By && Ry > Ly) {
				res +=2;
			}
			
		}else if(By == Ry && By == Ly) {
			
			if(Rx > Bx && Rx < Lx || Rx < Bx && Rx > Lx) {
				res +=2;
			}
			
		}
		
		out.println(res);
	}

}
