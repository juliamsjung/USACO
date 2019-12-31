import java.io.*;
import java.util.*;
public class game {

	static Scanner in;
	static PrintWriter out;
	static int[][] game;
	static int p, r;
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("game.in"));
			out = new PrintWriter (new File("game.out"));
			
			init();
			solve();
			
			for(int i =0; i < list.size(); i++) {
				out.println(list.get(i));
			}
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	static private void init() {
		p = in.nextInt();
		r = in.nextInt();
		game = new int[r][p];
		
		
		for(int i =0; i < r; i++) {
			for(int j =0; j < p; j++) {
				game[i][j] = in.nextInt();
			}
		}
	}
	
	static private void solve() {
		
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
				
				list.add("[" + i + " vs " + j + "]"+ p1 + " : " + p2);
				
			}
		}
	}

}
