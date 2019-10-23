//package dec2015;
import java.util.*;
import java.io.*;
public class speeding {
  
	static Scanner in;
	static PrintWriter out;
	static int[] ary;
	static int N, M, max;
 
  public static void main(String[] args) {
    try{
      in = new Scanner (new File("speeding.in"));
      out = new PrintWriter (new File("speeding.out"));

      init();
      //System.out.println(Arrays.toString(ary));
      out.println(solve());
      
      
      in.close();
      out.close();


    }catch(Exception e){
      e.printStackTrace();
    }
  }

  private static void init(){
    N = in.nextInt();
    M = in.nextInt();
    max = 0;

    ary = new int[100];
    int road =0;
    int speed =0;
    int temp =0;
    
    for(int k =0; k < N; k++){
    		road += in.nextInt();
        speed = in.nextInt();
        
        
      for(int j =temp; j< road;j++){
    	   	ary[j] = speed;
       }
   
      temp = road;
      //System.out.println(temp);
    }
    
  }

  private static int solve(){
    int road =0;
    int temp =0;
    
    for(int i =0; i < M; i++){
     
        road += in.nextInt();
        int speed = in.nextInt();
        

        for(int k =temp; k<road; k++){
          if(speed > ary[k]){
            max = Math.max(max, speed-ary[k]);
         }
         temp = road;
 
      }
    }

    return max;
  }

  
}