package day23;

class C
{
	final int pin_code=586103;//constant---final varible-cannot be assigned again
	int OTP=123;//-->Non final variable---can be assigned again
	final String name="Grishma";
}
public class Demo4 {
	public static void main(String[] args) {
		
		final int p1=10;
		int p2=20;
		
		C c1=new C();
//		c1.pin_code=586112;//Error
		c1.OTP=456; //Not an error 
		System.out.println(c1.pin_code);
		System.out.println(c1.OTP);
		
//		p1=20;//Error p1 is final varible cant be reassigned
		p2=30;
		System.out.println(p1);
		System.out.println(p2);
	}

}
