package day15;

public class Demo6 {
	public static void main(String[] args) {
		
	int[] a= {10,20,30,40,50,60,70}; //here a is array of integers
	
	
	System.out.println(a.length);//Print array size

	//System.out.println(a[0]);
	//System.out.println(a[1]);
	//System.out.println(a[2]);
	//System.out.println(a[3]);
	//System.out.println(a[4]); Instead of writing like this we can use for loop
	
	//for(int i=0;i<=4;i++)// size of Array is hard coded(i<=4)
	//{
	//	System.out.println(a[i]);
	//}
	//Instead of hard coding the six of Array 
	//we can make it Dynamic by using "length" 
	//property of an Array
	
	int size=a.length;
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);//Print 1st to last element
	}
	
	System.out.println("-------");
	
	for(int i=size-1;i>=0;i--)//Print Array elements in reverse order
	{
		System.out.println(a[i]);
	}
	System.out.println("-------");
	
	for(int i=0;i<size;i+=2)//Print 1st to last 
		//alternate numbers of array elements(Skip)
	{
		System.out.println(a[i]);
	}
		
}
}
