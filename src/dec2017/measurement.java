package dec2017;
import java.util.*;
import java.io.*;
public class measurement {
	
	static Scanner in;
	static PrintWriter out;
	
	static int[] B,E,M;
	static int N, count;
	static String board;

	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("measurement.in"));
			out = new PrintWriter(new File ("measurement.out"));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}
	
	private static void init() {
		B = new int[101];
		E = new int[101];
		M = new int[101];
		N = in.nextInt();
		board = "BEM";
		
		for(int i =1; i < 101; i++) {
			B[i] =7;
			E[i] =7;
			M[i] =7;
		}
		
		
	}
	
	private static int solve() {
		
		for(int i =0; i< N; i++) {
			int day = in.nextInt();
			String cow = in.next();
			int milk = in.nextInt();
			
			//System.out.println(day + " " + cow + " " + milk);
			
			if(cow.equals("Bessie")) {
				for(int j =day; j < 101; j++) {
					B[j] += milk;
				}
			}
			
			else if(cow.equals("Elsie")) {
				for(int j =day; j < 101; j++) {
					E[j] += milk;
				}
			}
			
			else if(cow.equals("Mildred")) {
				for(int j =day; j < 101; j++) {
					M[j] += milk;
					//System.out.println("[Mildred] " + M[i]);
				}
			}
			
		}
		//System.out.println(Arrays.toString(B));
		//System.out.println(Arrays.toString(E));
		//System.out.println(Arrays.toString(M));
		
		
		for(int i =1; i < 101; i++) {
			String temp = "";
			int max = Math.max(B[i], E[i]);
			max = Math.max(max, M[i]);
			
			if(max == B[i])
				temp+="B";
			if(max == E[i])
				temp+="E";
			if(max == M[i])
				temp+="M";
			
			if(!temp.equals(board)) {
				count++;
				board= temp;
			}
			
		}
		
		return count;
	}

}
