package day6;

public class Demo5 {

	public static void main(String[] args) {
		
		short s= 200; 
		byte b=(byte)s; //byte can store maximum 127 , 
		// if we try to store above that we loose data
		
		System.out.println(s); //200
		System.out.println(b); // could not store 127 as it exceeds byte limit(127)
		//so it looses data and -56 is printed
	}

}
