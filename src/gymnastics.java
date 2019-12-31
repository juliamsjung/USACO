import java.io.*;
import java.util.*;
public class gymnastics {

	static Scanner in;
	static PrintWriter out;
	static int p,r;
	static int[][] game;
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("gymnastics.in"));
			out = new PrintWriter(new File("gymnastics.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		r= in.nextInt();
		p= in.nextInt();
		game = new int[r][p];
		
		for(int i =0; i < r; i++) {
			for(int j =0; j < p; j++) {
				int temp = in.nextInt();
				game[i][temp-1] = j+1;
				
			}
		}
		/*
		for(int i =0; i < r; i++) {
			for(int j =0; j < p; j++) {
				System.out.println(game[i][j]);
			}
		}
		*/
		
		
	}
	
	private static void solve() {
		for(int i =0; i < p; i++) {
			for(int j =i+1; j < p; j++) {
				
				int p1 = 0;
				int p2 = 0;
				
				for(int k =0; k < r; k++) {
					if(game[k][i] > game[k][j]) {
						p1++;
					}else {
						p2++;
					}
				}
				if(p1 ==0 || p2 ==0) {
					list.add("[" + i + " vs " + j + "]"+ p1 + " : " + p2);
				}
				
				
			}
		}
		out.println(list.size());
	}

}
