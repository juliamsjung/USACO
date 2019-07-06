package _1_2;

import java.util.Arrays;

public class pacticeClass {

	public static void main(String[] args) {
		
		student [] list = new student [4];
		
		list[0] = new student ("Julia", 'C', 2);
		list[1] = new student ("Hyeonchae", 'A', 4);
		list[2] = new student ("Ethan", 'B', 3);
		list[3] = new student ("Yunju", 'A', 4);
		
		Arrays.sort(list);
		
		for(int i =0; i<4; i++) {
			System.out.print(list[i].name + " ");
		}
		
		
		// declare a variable ( primitive data type )
		
		int a;
		
		a = 5; // variable = value
		
		// declare a reference variable ( reference data type )
		
		student s1;
		
		s1 = new student("Julia", 'C', 2); // variable = value(memory address)

	}
	
	static class student implements Comparable<student>{
		
		// 1 data field(s)
		
		String name;
		char letter;
		int gpa;
		
		// 2 constructors(s); default constructor / regular constructor
		
		public student(String n, char l, int g) {
			
			name = n;
			letter = l;
			gpa = g;
			
		}

		@Override
		public int compareTo(student that) {
			// TODO Auto-generated method stub
			return that.gpa - this.gpa;
		}
		
		// 3 method(s)
	}
	
	

}
