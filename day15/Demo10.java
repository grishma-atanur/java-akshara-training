package day15;

public class Demo10 {
	//Print smallest number present in the array - Interview Question
	public static void main(String[] args) {
		int i;
		int[] a= {90,10,30,1,3,23};
		
		int n=a[0];//let us assume smallest number is a[0] itself
		
		for( i=0;i<a.length;i++)
		{
			if(n>a[i])// To get the biggest number change to <()less than
			{
				n=a[i];
			}
			
		}
		System.out.println(n);
	}

}
