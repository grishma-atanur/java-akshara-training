package day23;

class D
{
	static String city="pune";
	int phno=100;
	
}

public class Demo7 {
	public static void main(String[] args) {
		
	
	
	int ph2=300;//local variables are neither static nor non static, 
	//they are stored in stack, neither in object nor in static pool
	
	D d1=new D();
	d1.city="Delhi";
	d1.phno=101;
	
	System.out.println(d1.city);//Delhi
	System.out.println(d1.phno);//101
	
	D d2=new D();
	System.out.println(d2.city);//Delhi
	System.out.println(d2.phno);//100
	
	}	

}
