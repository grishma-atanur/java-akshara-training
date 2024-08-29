package day14;

public class Demo7 {
	public static void main(String[] args) {
		
	
	//from 1 to 100 print which all the numbers along 
	//with status(which is prime and which is not prime)
	for(int n=1;n<=100;n++)
	{
		String msg= "is a Prime number";
		
	if(n == 1)
	{
		msg=" is NOT a Prime Number";
		
	}
	else
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				msg="is NOT a Prime Number";
				break;
			}
		}
		
	}
	System.out.println(n+ " "+msg);
	} 
	}
}



