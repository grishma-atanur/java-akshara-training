package day21;

/*create Emp class with a variable emp_name, store ur name
 * create object of Emp class
 * print the name present inside Emp object
 */

class Emp{
	
	String emp_name="Grishma";
}

public class Demo4 {
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		System.out.println(e1.emp_name);
	}

}
