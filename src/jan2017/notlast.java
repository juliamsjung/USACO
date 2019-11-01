package jan2017;
import java.util.*;
import java.io.*;
public class notlast {
	
	static Scanner in;
	static PrintWriter out;
	static Map<String, Integer> map;
	static Map<Integer,String> order;
	static int x;

	
	public static void main(String args[]) {
		
		try {
			in = new Scanner (new File("notlast.in"));
			out = new PrintWriter (new File("notlast.out"));
			
			init();
			out.println(solve());
			
			in.close();
			out.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private static void init() {
		map = new HashMap<String,Integer>();		
		
		x = in.nextInt();
		
		for(int i =0; i < x; i++) {
			String temp = in.next();
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp) + in.nextInt());
			}else{
				map.put(temp, in.nextInt());
			}
		}
 


	}
	private static String solve() {
      
      order = new TreeMap<Integer,String>();
      
      for(String name : map.keySet()) {
            int num = map.get(name);
			if(order.containsKey(num)) {
				order.put(num, order.get(num)+", "+name);
			}else {
				order.put(num, name);
			}
		}
     
           
		String ans="";
        int i = 0;
		for(int key : order.keySet()) {
			ans = order.get(key);
            i++;
            if(i==2) break;
		}
		
	
		if(ans.indexOf(", ")>=0) return "Tie";
		else return ans;
		
	}

}
