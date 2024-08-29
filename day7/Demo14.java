package day7;

public class Demo14 {

	public static void main(String[] args) {
		
		// >,<,>=,<=,==,!=

		System.out.println(10>5);//true
		System.out.println(5>10); //false
		System.out.println(5>5); //false
		
		System.out.println(5<10); //true
		System.out.println(10<5); //False
		System.out.println(10<10); //False
		
		System.out.println(10>=5);//true
		System.out.println(10>=10);//true
		System.out.println(10>=15);//false
		
		System.out.println(5<=15); //true
		System.out.println(10<=10); //true
		System.out.println(10<=9); //false
		
		System.out.println(10==10);//true
		System.out.println(10==5);//false
		
		System.out.println(true==true);//true
		System.out.println(true==false);//false
		
		System.out.println(true!=false);//true
		System.out.println(true!=true);//False
		System.out.println(false!=false);//False
		
		}
}
