package day5;

public class Demo1 {

	public static void main(String[] args) {
	
		int i ; /*Declaration : Memory space i is created in "Stack Memory" 
		in which integer can be stored */
		i=10; // 10 is stored in memory space i
		System.out.println(i);
		i=20; // 10 is deleted and 20 is stored in memory space i
		System.out.println(i);
		i=30; // 20 is deleted and 30 is stored in memory space i
		System.out.println(i);
		
// At any given time variable i can store only one value
	}

}
