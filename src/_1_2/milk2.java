package _1_2;

public class milk2 {
	public static void main (String [] args) {
		pair f[] = new pair[N];
		for( int i =0; i < N; i ++) {
			f[i] = new pair(Integer.parseInt(in.nextToken()),Integer.parseInt(in.nextToken());
		}
		Arrays.sort(f);
		}

}
class pair implements Comparable<pair>{
	int s;
	int e;
	public pair(int s1, int e1) {
		s = s1;
		e = e1;
	}
	public int compareTo(pair that) {
		return this.s - that.s;
	}
	
}
