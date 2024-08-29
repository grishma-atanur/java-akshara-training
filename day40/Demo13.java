package day40;
//Print only digits present in the given string
public class Demo13 {
	public static void main(String[] args) {
		String s="Page 1 of 23";
		
		for(char c:s.toCharArray())
		{
			if(c>='0' && c<='9')
			{
				System.out.println(c);
			}
		}
	}

}
