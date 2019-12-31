package dec2018;
import java.io.*;
import java.util.*;
public class mixmilk {
	
	
	static Scanner in;
	static PrintWriter out;
	static int[] cap;
	static int[] val;
	
	public static void main(String[] args) {
		
		try {
			in= new Scanner (new File("mixmilk.in"));
			out = new PrintWriter(new File("mixmilk.out"));
			
			init();
			solve();
			
			for(int i =0; i < 3; i++) {
				out.println(val[i]);
			}
			
			in.close();
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init() {
		cap = new int[3];
		val = new int[3];
		
		for(int i =0; i < 3; i++) {
			cap[i] = in.nextInt();
			val[i] = in.nextInt();
		}
	}
	
	private static void solve() {
		for(int i =0; i < 100; i++) {
			
			pour(0,1);
			//System.out.println(i + " " + Arrays.toString(val));
			i++;
			if(i>=100)
				break;
			
			pour(1,2);
			//System.out.println(i + " " + Arrays.toString(val));
			i++;
			if(i >=100)
				break;
			
			pour(2,0);
			//System.out.println(i + " " + Arrays.toString(val));
			
			
		}
	}
	
	private static void pour (int a , int b) {
		if(val[a] + val[b] <= cap[b]) {
			val[b] += val[a];
			val[a] = 0;
		}
		else {
			val[a] = val[a] + val[b] - cap [b];
			val[b] = cap[b];
		}
	}

}
