package day38;

class Dog
{
	
}

public class Demo4 {
	public static void main(String[] args) {
		
		Object[] all= {new Dog(),"Grishma",10,true};
		//Dog-->auto-upcasting
		//"Grishma"-->auto-upcasting
		//10-->auto-boxing-->auto-upcasting
		//true-->auto-boxing-->auto-upcasting
		
		for(Object v:all)
		{
			System.out.println(v);
		}
	

}
} 
