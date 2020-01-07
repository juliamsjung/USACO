package feb2019;
import java.io.*;
import java.util.*;
public class revegetate {

	static Scanner in;
	static PrintWriter out;
	static int N, M;
	static ArrayList<String>[] field;
	static ArrayList<String>[] seed;
	static String[] b;
	
	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("revegetate.in"));
			out = new PrintWriter(new File("revegetate.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		
		N = in.nextInt();
		M = in.nextInt();
		field = new ArrayList[N];

		seed = new ArrayList[N];
		
		b= new String [N];
		
		
		for(int i =0; i < N; i++) {
			field[i] = new ArrayList<String>();
			seed[i] = new ArrayList<String>();
			
			if(i != 0) {
				seed[i].add("1");
				seed[i].add("2");
				seed[i].add("3");
				seed[i].add("4");
			}
			
		}
		seed[0].add("1");
		
		
		int cow = 1;
		for(int i =0; i < M; i++) {
			int temp1 = in.nextInt()-1;
			int temp2 = in.nextInt()-1;
			
			field[temp1].add("" + cow);
			field[temp2].add("" + cow);
			cow++;
		}
		
		//System.out.println(Arrays.toString(field));
		//System.out.println(Arrays.toString(seed));
		
	}
	
	private static void solve() {
		
		for(int i =0;i < field.length; i++) {
			b[i] = seed[i].get(0);
			String key = b[i];
			
			for(String n : field[i]) {
				for(int j =i+1; j < field.length; j++) {
					if(field[j].contains(n)) {
						seed[j].remove(key);
					}
				}
			}
			
			
		}
		
		for(int i =0; i < b.length; i++) {
			out.print(b[i]);
		}
		out.println("");
	}

}
