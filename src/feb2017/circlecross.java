package feb2017;
import java.io.*;
import java.util.*;
public class circlecross {
	
	static Scanner in;
	static PrintWriter out;
	static String str;
	static int cross;
	static char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	static String[] a;
	

	public static void main(String[] args) {
		try{
			in = new Scanner (new File("circlecross.in"));
			out = new PrintWriter(new File("circlecross.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	private static void init() {
		str = in.nextLine();
		a = new String[26];
	}
	
	private static void solve() {
		
		for(int i =0; i < 26; i++) {
			int index1 = str.indexOf(abc[i]);
			int index2 = str.lastIndexOf(abc[i]);
			
			String temp = str.substring(index1+1, index2);
			
			int[] a = new int[26];
			for(int j =0; j < temp.length(); j++) {
				a[temp.charAt(j)-65]++;
			}
			for(int j = 0; j < 26; j++) {
				if(a[j] == 1)
					cross++;
			}
			
		}
		
		
		
		out.println(cross/2);
	}

}
