package feb2017;
import java.io.*;
import java.util.*;

import javax.naming.PartialResultException;
public class cowqueue {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static pair[] a;
	static int ans;

	public static void main(String[] args) {
		try{
			in = new Scanner (new File("cowqueue.in"));
			out = new PrintWriter(new File("cowqueue.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		N = in.nextInt();
		a = new pair[N];
	
		
		for (int i = 0; i < N; i++) {
			a[i] = new pair(in.nextInt(), in.nextInt());
		}
      Arrays.sort(a);
      
      /*
      for(int i =0; i < N ; i++) {
    	  	System.out.println(a[i].toString());
      }
	*/
	}
	
	private static void solve() {
		
      ans = 0;
      for(int i =0; i< N;i++){
        int x = a[i].arrives ;
        int y = a[i].time;
        if(ans < x) ans = x+y;
        else ans+=y;
      }
      
      
		
		out.println(ans);
		
	}
}
	class pair implements Comparable<pair>{

		int arrives;
		int time;
		
		pair(int a , int t){
			arrives = a;
			time = t;
		}
		
		@Override
		public int compareTo(pair that) {
			if(this.arrives == that.arrives)
				return this.time - that.time;
			else
				return this.arrives - that.arrives;
		}
		public String toString(){
		    return arrives+" "+time;
		  }
	}

