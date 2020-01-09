package feb2019;
import java.util.*;
import java.io.*;
public class traffic {
	
	static Scanner in;
    static PrintWriter out;
    static int N, a1, b1;
    static int[] a, b;
    static String[] ramp;

	public static void main(String[] args) {
		
		try{
			in = new Scanner (new File("traffic.in"));
			out = new PrintWriter(new File("traffic.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() throws IOException {
      
        N = in.nextInt();
        ramp = new String[N];
        a = new int[N];
        b = new int[N];

        for (int i = 0; i < N; i++) {
            ramp[i] = in.next();
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        // System.out.println(Arrays.toString(ramp));
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
    }

	private static void solve() throws IOException {
		
		a1= -999999;
		b1 = 9999999;
        for (int i = N - 1; i >= 0; i--) {
            if (ramp[i].equals("none")) {
                a1 = Math.max(a1, a[i]);
                b1 = Math.min(b1, b[i]);
            }
            if (ramp[i].equals("off")) {
                a1 += a[i];
                b1 += b[i];
            }
            if (ramp[i].equals("on")) {
                a1 -= b[i];
                b1 -= a[i];
                a1 = Math.max(0, a1);
            }
        }
        out.println(a1 + " " + b1);

        a1 = -9999999;
        b1 = 9999999;
        for (int i = 0; i < N; i++) {
            if (ramp[i].equals("none")) {
                a1 = Math.max(a1, a[i]);
                b1 = Math.min(b1, b[i]);
            }
            if (ramp[i].equals("on")) {
                a1 += a[i];
                b1 += b[i];
            }
            if (ramp[i].equals("off")) {
                a1 -= b[i];
                b1 -= a[i];
                a1 = Math.max(0, a1);
            }
        }
        out.println(a1 + " " + b1);
    }


}
