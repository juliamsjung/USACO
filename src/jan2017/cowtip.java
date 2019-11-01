//package jan2017;
import java.io.*;
import java.util.*;
public class cowtip {
	
	static Scanner in;
	static PrintWriter out;
	static int N, LR,LC, count;
	static int[][] f;

	public static void main (String[] args) {
		try {
			in= new Scanner (new File("cowtip.in"));
			out= new PrintWriter(new File ("cowtip.out"));
			
			init();
			
			while(!checkAll()) {
				LRLC();
				until(LR,LC);
			}
			
			//System.out.println(f[2][2]);
			//System.out.println(LR + " " + LC);
			out.println(count);
			
			in.close();
			out.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		N = in.nextInt();
		in.nextLine();
		f = new int[N][N];
		LR =0;
		LC =0;
		
		for(int i =0; i < N; i++) {
			String line = in.nextLine();
			//System.out.println(line);
			for(int j =0; j < N; j++) {
				int temp = Integer.parseInt(line.substring(j,j+1));
				f[i][j]= temp;
				//System.out.print(f[i][j] + " ");
			}
			//System.out.println("");
		}
		
	}
	
	private static void LRLC() {
		boolean c = false;
		for(int i =N-1; i >=0; i--) {
			for(int j =N-1; j >=0; j--) {
				//System.out.println("["+ i + "," + j + "]: " + f[i][j]);
				if(f[i][j] == 1) {
					LR = i;
					LC =j;
					c = true;
					break;
				}
				
			}
			if(c) break;
			
		}
		
	}
	
	private static void until(int r, int c) {
		
		for(int i =r; i >=0; i--) {
			for(int j =c; j>=0; j--) {
				if(f[i][j]==1) {
					f[i][j] = 0;
				}else {
					f[i][j]=1;
				}
				
			}
		}
		
		count++;
	}
	
	private static boolean checkAll() {
		boolean c = true;
		
		for(int i = 0; i < N; i++) {
			for(int j =0; j < N; j++) {
				if(f[i][j] == 1) {
					c = false;
					break;
				}
			}
		}
		
		return c;
	}
	
	

}
