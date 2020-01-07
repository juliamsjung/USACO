package open2018;
import java.io.*;
import java.util.*;
public class tttt {

	static Scanner in;
	static PrintWriter out;
	static char[][] board;
	static HashSet<String> v;
	static HashSet<String> teams;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("tttt.in"));
			out = new PrintWriter(new File("tttt.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		board = new char[3][3];
		teams = new HashSet<String>();
		v = new HashSet<String>();
		
		for(int i =0; i < 3; i++) {
			String temp = in.nextLine();
			
			board[i][0] = temp.charAt(0);
			board[i][1] = temp.charAt(1);
			board[i][2] = temp.charAt(2);
			
			//System.out.println(Arrays.toString(board[i]));
			
		}
		
		
	}
	
	private static void solve() {
		
		for(int i =0; i < 3; i++) {
			char a = board[i][0];
			char b = board[i][1];
			char c = board[i][2];
			
			if(a == b && a == c) {
				v.add("" + a);
			}else if(a ==b) {
				teams.add("" + a + c);
				teams.add("" + c + a);
			}else if(b ==c) {
				teams.add("" + a + c);
				teams.add("" + c + a);
			}else if(c ==a) {
				teams.add("" + b + a);
				teams.add("" + a + b);
			}
				
			
			char A = board[0][i];
			char B = board[1][i];
			char C = board[2][i];
			
			if(A == B&& A ==C) {
				v.add("" + A);
			}else if(A ==B) {
				teams.add("" + C + B);
				teams.add("" + B + C);
			}else if(B ==C) {
				teams.add("" + B + A);
				teams.add("" + A + B);
			}else if(C ==A) {
				teams.add("" + B + A);
				teams.add("" + A + B);
			}
				
		}
		
		char da = board[0][0];
		char db = board[1][1];
		char dc = board[2][2];
		
		if(da == db && da == dc) {
			v.add("" +  da);
		}else if(da ==db) {
			teams.add("" + dc + db);
			teams.add("" + db + dc);
		}else if(db ==dc) {
			teams.add("" + da + dc);
			teams.add("" + dc + da);
		}else if(dc ==da) {
			teams.add("" + db + da);
			teams.add("" + da + db);
		}
			
		
		char dA = board[0][2];
		char dB = board[1][1];
		char dC = board[2][0];
		
		if(dA == dB && dA == dC) {
			v.add("" + dA);
		}else if(dA ==dB) {
			teams.add("" + dC + dB);
			teams.add("" + dB + dC);
		}else if(dB ==dC) {
			teams.add("" + dA + dC);
			teams.add("" + dC + dA);
		}else if(dC ==dA) {
			teams.add("" + dB + dA);
			teams.add("" + dA + dB);
		}
		
		/*
		for(String n : teams) {
			System.out.println(n);
		}
		*/
		
		out.println(v.size());
		
		out.println(teams.size()/2);
		
	}

}
