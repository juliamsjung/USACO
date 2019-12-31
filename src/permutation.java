import java.io.*;
import java.util.*;
public class permutation {

	static Scanner in;
	static PrintWriter out;
	static String[] ary;
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		try {
			in= new Scanner(new File("permutation.in"));
			out = new PrintWriter(new File("permutation.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}
	
	private static void init() {
		ary = new String[4];
		
		for(int i =0; i < 4; i++) {
			ary[i] = in.next();
		}
	}
	
	private static void solve() {
		
		for(int i =0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i != j) {
					for(int k =0; k < 4; k++) {
						if(k != i && k != j) {
							for(int m =0; m<4; m++) {
								if(m != i && m != j && m != k)
									list.add(ary[i] + ary[j] + ary[k] + ary[m]);
							}//m
						}//if
					}//k
				}//if
			}//j
		}//i
		
		for(int i =0; i < list.size(); i++) {
			out.println(list.get(i));
		}
		System.out.println("size: " + list.size());
	}

}
