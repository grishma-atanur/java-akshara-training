package day14;
//Print sum of the digits present in given number
//number is 2347 , digits 2,3,4 and 7 , sum is  2+3+4+7=16
//using While loop
public class Demo10 {
	public static void main(String[] args) {
		
		int n=2347;
	
		while(n>0)
		{
			int lastdigit=n%10;
			System.out.print(lastdigit);
			n=n/10;
			
		}
		System.out.println();
		
		//we can also reverse using the another method like below
		n=123;
		String s="";
		while(n>0)
		{
			int lastdigit=n%10;
			s=s+lastdigit; // concatenating
			n=n/10;
			}
		System.out.println(s);
		
		//Another way-Mathematical way to reverse a number
		n=1235;
		int n2=0;
		while(n>0)
		{
			int lastdigit=n%10;
			n=n/10;
			n2=n2*10;
			n2=n2+lastdigit;
		}
		System.out.println(n2);
			
		}
	}


