package day40;
//How to split twice
public class Demo3 {
	public static void main(String[] args) {
		String s="Akshara-Training,By-Bhanu";
		String[] a=s.split(",");
		for(String v:a)
		{
			String[] b = v.split("-");
			for(String p:b)
			{
				System.out.println(p);
			}
			System.out.println("---------");
		}
		
	}

}
