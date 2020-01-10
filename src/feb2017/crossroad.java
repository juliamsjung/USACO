//package feb2017;
import java.io.*;
import java.util.*;
public class crossroad {
	
	static Scanner in;
	static PrintWriter out;
	static int N, cross;
	static ArrayList<Integer>[] r;

	public static void main(String[] args) {
		
		try{
			in = new Scanner (new File("crossroad.in"));
			out = new PrintWriter(new File("crossroad.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void init() {
		N = in.nextInt();
		r = new ArrayList[11];
		
		for(int i =0; i < 11; i++) {
			r[i] = new ArrayList<Integer>();
		}
		
	}
	
	public static void solve() {
		for(int i =0; i< N; i++) {
			int cow = in.nextInt();
			int side = in.nextInt();
			r[cow].add(side);
		}
		
		for(int i =1; i< 11; i++) {
			for(int j =1; j < r[i].size(); j++) {
				if(r[i].get(j-1) != r[i].get(j))
					cross++;
			}
		}
		
		out.println(cross);
	}

}
