import java.io.*;
import java.util.*;
public class lineup {
	
	static Scanner in;
	static PrintWriter out;
	static ArrayList<String> arr = new ArrayList<String>();
	static int N;
	static int[][] list;
	static ArrayList<String> poss = new ArrayList<String>();
	
	static HashMap <String, Integer> x = new HashMap<String, Integer>();
	static HashMap <Integer, String> y = new HashMap<Integer, String>();
	

	public static void main(String[] args) {
		
		try {
			in = new Scanner (new File("lineup.in"));
			out = new PrintWriter(new File("lineup.out"));
			
			init();
			solve();
			
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void init() {
		
		x.put("Beatrice", 0);
		x.put("Belinda", 1);
		x.put("Bella", 2);
		x.put("Bessie", 3);
		x.put("Betsy", 4);
		x.put("Blue", 5);
		x.put("Buttercup", 6);
		x.put("Sue", 7);
		
		y.put(0, "Beatrice");
		y.put(1, "Belinda");
		y.put(2, "Bella");
		y.put(3, "Bessie");
		y.put(4, "Betsy");
		y.put(5, "Blue");
		y.put(6, "Buttercup");
		y.put(7, "Sue");
		
		
		N = in.nextInt();
		in.nextLine();
		list = new int[N][2];
		
		for(int i =0; i < N; i ++) {
			list[i][0] = cowSort(in.next());
			in.next();
			in.next();
			in.next();
			in.next();
			list[i][1] = cowSort(in.next());
			
			//System.out.println(list[i][0] + " " + list[i][1]);
		}
		
				
	}
	
	private static void solve() {
		int count = 0;
		String orders = "0 1 2 3 4 5 6 7";
        String[] temp = orders.split(" ");
		for(int i =0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(i != j) {
					for(int k =0; k < 8; k++) {
						if(k != i && k != j) {
							for(int m =0; m<8; m++) {
								if(m != i && m != j && m != k) {
									for(int l = 0; l < 8; l++) {
										if(l != i && l != j && l != k && l !=m) {
											for(int n =0; n < 8; n++) {
												if(n != i && n != j && n != k && n !=m && n !=l) {
													for(int o =0; o < 8; o++) {
														if(o != i && o != j && o != k && o !=m && o !=l && o !=n) {
															for(int p =0; p<8;p++) {
																if(p != i && p != j && p != k && p !=m && p !=l &&p !=n && p !=o) {
																	arr.add(temp[i] + temp[j] + temp[k] + temp[m] + temp [l] + temp[n] + temp[o] + temp[p]);
																}//if
															}//p =8
														}//if
													}//o =7
												}//if
											}//n =6
										}//if
									}//l =5
								}//if	
							}//m =4
						}//if
					}//k =3
				}//if
			}//j =2
		}//i =1
		boolean chk = true;
		for(int i =0; i < arr.size(); i++) {
			chk = false;
			for(int j =0; j < N; j++) {
				String temp1 ="" +  list[j][0] + list[j][1];
				String temp2 = "" + list[j][1] + list[j][0];
				
				if(arr.get(i).contains(temp1) || arr.get(i).contains(temp2)) {
					continue;
				}
				else {
					chk = false;
					break;
				}
			}
			if(chk == false) {
				continue;
			}else {
				poss.add(arr.get(i));
			}
		}
		
		Collections.sort(poss);
		//out.println(poss.get(0));
		
		for(int i =0; i < 8; i++) {
			if(poss.get(0).substring(i,i+1).equals("0"))
				out.println("Beatrice");
			else if(poss.get(0).substring(i,i+1).equals("1"))
				out.println("Belinda");
			else if(poss.get(0).substring(i,i+1) .equals("2"))
				out.println("Bella");
			else if(poss.get(0).substring(i,i+1) .equals("3"))
				out.println("Bessie");
			else if(poss.get(0).substring(i,i+1) .equals("4"))
				out.println("Betsy");
			else if(poss.get(0).substring(i,i+1).equals("5"))
				out.println("Blue");
			else if(poss.get(0).substring(i,i+1) .equals("6"))
				out.println("Buttercup");
			else
				out.println("Sue");
		}
		
		
		
		
	}
	
	private static int cowSort (String x) {
		if(x.equals("Beatrice")) {
			return 0;
		}
		else if(x.equals("Belinda")) {
			return 1;
		}
		else if(x.equals("Bella")) {
			return 2;
		}
		else if(x.equals("Bessie")) {
			return 3;
		}
		else if(x.equals("Betsy")) {
			return 4;
		}
		else if(x.equals("Blue")) {
			return 5;
		}
		else if(x.equals("Buttercup")) {
			return 6;
		}
		else {
			return 7;
		}
	}

}
