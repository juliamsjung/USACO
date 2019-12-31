import java.io.*;
import java.util.*;
public class whereami {

	static Scanner in;
	static PrintWriter out;
	static int length;
	static String hayley;
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		try {
			in = new Scanner (new File("whereami.in"));
			out = new PrintWriter(new File("whereami.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		length = in.nextInt();
		in.nextLine();
		hayley = in.nextLine();
		
	}
	
	private static void solve() {
		int count =1;
		for(int i =0; i < hayley.length(); i++) {
			
			String temp = "";
			
			for(int j =0; j < hayley.length(); j++) {
				if(j+count <= hayley.length())
				temp += hayley.substring(j, j + count)+ " ";
				
			}
			
			count++;
			list.add(temp);
			
		}
		
		String temp2 = "";
		for(int i =1; i < list.size(); i++) {
			String[] temp22 = list.get(i).split(" ");
			for(int j =0; j < temp22.length-1; j++) {
				for(int k =temp22.length-1; k >=1; k--) {
					if(temp22[j].equals(temp22[k]) && j!= k){
						temp2 = temp22[j];
					}
				}
			}
		}
		out.println(temp2.length()+1);
	
		
	}

}
