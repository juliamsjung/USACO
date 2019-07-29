import java.util.*;
public class testclass {
	public static void main(String []args) {
		
		char[] ary = new char[4];
		ary[0] = 'a';
		ary[1] = 'b';
		ary[2] = 'c';
		ary[3] = 'd';
		
		for(int i =0; i < ary.length; i++) {
			for(int j =0; j < ary.length; j++) {
				for(int k =0; k< ary.length; k++) {
					for(int m =0; m < ary.length; m++) {
						if(i != j && i != k && i != m && j !=k && j!=m && k != m) {
							System.out.println("("+ ary[i] + ", " + ary[j]+") (" + ary[k] + ", " + ary[m] +")" );
							
						}
							
					}
				}
				
			}
		}
	}
}
