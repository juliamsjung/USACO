import java.io.*;
import java.util.*;
public class word {
	
	static Scanner in;
	static PrintWriter out;
	static String[] word;
	static int[] count;
	static int N, K;

	public static void main(String[] args) {
		
		try {
			in = new Scanner(new File("word.in"));
			out = new PrintWriter(new File ("word.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private static void init() {
		N = in.nextInt();
		K = in.nextInt();
		in.nextLine();
		word = new String[N];
		count = new int[N];
		
		word = in.nextLine().split(" " );
		
		for(int i =0; i < N; i++) {
			count[i] = word[i].length();
		}
		/*
		System.out.println(Arrays.toString(word));
		System.out.println(Arrays.toString(count));
		*/
	}
	private static void solve() {
		
		String result = "";
        int temp = 0;
        for(int i = 0; i < N; i++){
            //System.out.println(count[i] + temp);
            if(count[i] + temp > K){
                result = result.substring(0,result.length()-1);
                result += "\n" + word[i] + " ";
                temp = count[i];
            }
            else if(count[i] + temp <= K){
                temp+= count[i];
                result += word[i] + " ";
            }

        }
        out.println(result.substring(0,result.length()-1));
    }
	

}
