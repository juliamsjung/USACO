package feb2018;
import java.io.*;
import java.util.*;
class hoofball {
	
	static Scanner in;
	static PrintWriter out;
	static int N;
	static int count;
	static int[] list, b, t, index;

	public static void main(String[] args) {
		
		try{
			in = new Scanner (new File("hoofball.in"));
			out = new PrintWriter(new File("hoofball.out"));
			
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
		list = new int [N];
		index = new int[N];

		b = new int[N];
		t = new int[N];
		
		
		for(int i =0; i < N; i++) {
			list[i] = in.nextInt();
			index[i] =i;
		}
		
		Arrays.sort(list);
	}
	
	private static void solve() {
		t[0] =1;
		t[N-1] = N-2;
		b[1]++;
		b[N-2]++;
		
		for(int i =1; i < N-1; i ++) {
			int temp=0;
			int left = list[i] - list[i-1];
			int right = list[i+1] - list[i];
			
			if(left <= right) {
				temp = i-1;
			}else {
				temp =i+1;
			}
		
			t[i] = temp;
			b[temp]++;
					
		}
		
		
		for(int i =0; i < N; i++) {
			if(b[i] ==0)
				count++;
		}
		for(int i =0; i < N-1;i++) {
			if(t[i] == i+1 && t[i+1] ==i && b[i] ==1 && b[i+1] ==1) {
				count++;
				i++;
			}
		}
		out.println(count);
		
	
	}

}
