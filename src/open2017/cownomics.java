package open2017;
import java.io.*;
import java.util.*;
public class cownomics {
	
	static Scanner in;
	static PrintWriter out;
	static int N , M;
	static char[][] spot, plain;
	static int count;

	public static void main(String[] args) {
		try{
			in = new Scanner (new File("cownomics.in"));
			out = new PrintWriter(new File("cownomics.out"));
			
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
		 M = in.nextInt();
		 in.nextLine();
		 
		 spot = new char[N][M];
		 plain = new char[N][M];
		 
		 for(int i =0; i < N; i++) {
			 String temp = in.nextLine();
			 for(int j =0; j < M; j++) {
				 spot[i][j] = temp.charAt(j);
			 }
		 }
		 for(int i =0; i < N; i++) {
			 String temp = in.nextLine();
			 for(int j =0; j < M; j++) {
				 plain[i][j] = temp.charAt(j);
			 }
		 }
		 
	}
	
	private static void solve() {
		
		for(int i =0; i < M ; i++) {
			
			boolean chk = true;
			
			for(int j =0; j< N; j++) {
				for(int k =0; k< N; k++) {
					if(spot[j][i] == plain[k][i]) {
						chk = false;
						break;
					}
				}
				if(chk == false)
					break;
			}
			
			if(chk)
				count++;
			
		}
		out.println(count);
		
		
	}

}
