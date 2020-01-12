package open2017;
import java.io.*;
import java.util.*;
public class art {
	
	static Scanner in;
	static PrintWriter out;
	static int[][] a;
	static int N;
	static int[] paint;
	static int count;

	public static void main(String[] args) {
		try{
			in = new Scanner (new File("art.in"));
			out = new PrintWriter(new File("art.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		N = in.nextInt();
		a = new int[N][N];
		in.nextLine();
		paint = new int[10];
		paint[0] = -1;
		
		for(int i =0; i < N; i++) {
			String temp = in.nextLine();
			for(int j =0; j < N ; j++) {
				a[i][j] = Integer.parseInt("" + temp.charAt(j));
			}
			//System.out.println(Arrays.toString(a[i]));
		}
	}
	
	private static void solve() {
		
		for(int i =1; i < 10; i++) {
			
			int maxX = 0;
			int maxY = 0;
			int minX = Integer.MAX_VALUE;
			int minY = Integer.MAX_VALUE;
			
			boolean isPaint = false;
			for(int j =0; j < N; j++) {
				for(int k =0; k < N; k++) {
					if(a[j][k] == i) {
						maxX = Math.max(maxX, j);
						maxY = Math.max(maxY, k);
						minX = Math.min(minX, j);
						minY = Math.min(minY, k);
						isPaint = true;
					}
				}
			}
			if(isPaint == false) {
				paint[i] = -1;
			}
			
			if(minY == Integer.MAX_VALUE)
				minY =0;
			if(minX == Integer.MAX_VALUE)
				minX = 0;
			
			//System.out.println(i + "rectangle: (" + maxX + ", " + maxY + ") (" + minX + ", " + minY+ ")");
			if(minX == 0 && minY == 0 && maxX == 0 && maxY ==0) {
				
			}else {
				for(int j = minX; j <=maxX; j++) {
					for(int k = minY; k <=maxY; k++) {
						
						int n = a[j][k];
						//System.out.println(i + " " + n);
						if(n != i) {
							paint[n]++;
						}
					}
				}
			}
			
			
			//System.out.println("max " + maxX + " " + maxY);
			//System.out.println("min " + minX + " " + minY);
			
		}
		//System.out.println(Arrays.toString(paint));
		for(int i =1; i < 10; i++) {
			if(paint[i] == 0)
				count++;
		}
		
		out.println(count);
	}

}
