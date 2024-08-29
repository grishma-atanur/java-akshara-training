package day14;

public class Demo9 {
	//Print sum of the digits present in given number
	//number is 2347 , digits 2,3,4 and 7 , sum is  2+3+4+7=16
	public static void main(String[] args) {
		
		int n= 2347;
		int lastdigit;
		
		lastdigit=n%10; //7
		System.out.println(lastdigit);
		n=n/10; //234-->deleting last digit of the number...here 7 will be deleted 
		// and just 234 will be stored in n, as n is an Integer not floating
		
		lastdigit=n%10;//4
		System.out.println(lastdigit);
		n=n/10;//23
		
		lastdigit=n%10; //3
		System.out.println(lastdigit);
		n=n/10; //2
		
		lastdigit=n%10; //2
		System.out.println(lastdigit);
		n=n/10; //0
	}

}
