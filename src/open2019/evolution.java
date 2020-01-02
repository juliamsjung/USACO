package open2019;
import java.io.*;
import java.util.*;
public class evolution {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static ArrayList<String>[] arr;
	static HashSet<String> set;
	static String[] ary;

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("evolution.in"));
			out = new PrintWriter(new File("evolution.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void init(){
		N = in.nextInt();
		arr = new ArrayList[N];
		set = new HashSet<String>();

		
		for(int i =0; i < N; i++) {
			
			int length = in.nextInt();
			arr[i] = new ArrayList<String>();
			
			for(int k =0; k < length; k++) {
				String tr = in.next();
				arr[i].add(tr);
				set.add(tr);
			}
		}
		
		ary = new String[set.size()];
		int count = 0;
		for(String n : set) {
			ary[count] = n;
			count++;
		}
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(ary));
		
		
	}
	
	private static void solve() {
		boolean chk = true;
		
		for(int i =0; i < ary.length; i++) {
			for(int j =i+1; j < ary.length; j++) {
				
				//System.out.println("(( " + ary[i] + ", " + ary[j] + " ))");
				if(chk== false)
					break;
				
				int a_c =0;
				int b_c =0;
				int ab_c =0;
				

				for(int k =0; k < N; k++) {
					//System.out.println("arr[k] : " +  arr[k]);
					boolean a = false;
					boolean b = false;
					for(int l = 0 ; l < arr[k].size(); l++) {
						
						if(arr[k].get(l).equals(ary[i])) 
							a = true;
						else if(arr[k].get(l).equals(ary[j]))
							b = true;
						
						//System.out.println(arr[k].get(l) + " : " + ary[i] +" " +  a);
						//System.out.println(arr[k].get(l) + " : " + ary[j] + " " +  b);
					}
					
					if(a && b)
						ab_c ++;
					else if(a)
						a_c++;
					else if(b)
						b_c++;
					
					if(ab_c >0 && a_c >0 && b_c >0) {
						chk = false;
						break;
					}
				}
				
				//System.out.println(ab_c);
			}
		}
		
		if(chk)
			out.println("yes");
		else
			out.println("no");
	
	}
	

}
