/*
  ID: juliajung
  LANG: JAVA
  TASK: namenum
 */
package _1_3;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class namenum {
	static Scanner in;
	static PrintWriter out;
	static ArrayList<String> list = new ArrayList <String>();
	static Scanner name;
	static String input;
	
	
	
	
	//static StringBuilder result;
	static String result= "";
	
	public static void main(String [] args) {
		try {
			
			//Initialize in & out
			in = new Scanner(new File("namenum.in"));
			out = new PrintWriter(new File("namenum.out"));
			name = new Scanner(new File("dict.txt"));
			
			init();
			
			
			//write out file
			out.print(solve());
			
			out.close();
			in.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		}private static void init() {
			//get data
			//initialize input variable
			while(name.hasNextLine()) {
				list.add(name.nextLine());
			}
			input =in.nextLine();
			
			
		}
		public static String solve() {
			//process and output
			
			for(int i =0; i < list.size(); i++) {
				if(input.equals(convert(list.get(i))))
					result += list.get(i) + "\n";
			}
			if(result.equals (""))
				return "NONE" + "\n";
			else 
				return result;
			
		}
		
		static String convert(String n) {
			String temp ="";
			for(int i =0; i < n.length(); i++) {
				char m = n.charAt(i);
				if(m=='A'||m=='B'||m=='C') 
					temp += "2";
				else if(m=='D'||m=='E'||m=='F') 
					temp += "3";
				else if(m=='G'||m=='H'||m=='I') 
					temp += "4";
				else if(m=='J'||m=='K'||m=='L') 
					temp += "5";
				else if(m=='M'||m=='N'||m=='O') 
					temp += "6";
				else if(m=='P'||m=='R'||m=='S') 
					temp += "7";
				else if(m=='T'||m=='U'||m=='V') 
					temp += "8";
				else if(m=='W'||m=='X'||m=='Y') 
					temp += "9";
			}
			return temp;
			
		}
		
		//arraylist
		//Scanner in - new Scanner ....
		//while loop (in.hasNextLine())
		//__.add(in.nextLine());

}

