package dec2015;
import java.io.*;
import java.util.*;
public class paint {
  static int[] ary;
  static int a,b,c,d, count;
  static Scanner in;
  static PrintWriter out;
  public static void main(String[] args) {
    
    try{
    		in = new Scanner(new File("paint.in"));
    		out = new PrintWriter(new File("paint.out"));
    		
    		init();
    		out.println(solve());
    		
    		in.close();
    		out.close();
    }
    catch(Exception e){
    		e.printStackTrace();
    }
  }
  private static void init(){
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();
    ary = new int [100];
  }

  private static int solve(){
    for(int i =a; i<b; i++){
      ary[i] = 1;
    }

    for(int i =c; i<d; i++){
      ary[i] =1;
    }

    for(int i =0; i < 100; i++){
      if(ary[i] == 1)
      count++;
    }
    return count;
  }
}