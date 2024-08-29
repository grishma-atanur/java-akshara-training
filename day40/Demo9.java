package day40;
//Interview Question- check whether given string is pallindrome
public class Demo9 {
	public static void main(String[] args) {
		String s1="Mom";
		String s2="";
		
		char[] a=s1.toCharArray(); //Convert the string into Array
		for(int i=s1.length()-1;i>=0;i--) //Reverse the string and store it in s2
		{
			s2=s2+a[i];
			
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equalsIgnoreCase(s2)) //comapare s1 and s2
		{
			System.out.println("String is a pallindrome");
		}
		else
		{
			System.out.println("String is not a pallindrome");
		}
		 
	}

}
