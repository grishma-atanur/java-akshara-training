package day22;
class Emp{
	String name="Grishma";
}

public class Demo4 {

	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.name="Asha";
		
		Emp e2=new Emp();
		e2.name="Bhavya";
		
		Emp[] allEmp=new Emp[2];
		allEmp[0]=e1;
		allEmp[1]=e2;
		
		System.out.println(allEmp);//prints Address
		System.out.println(allEmp[0]);//Prints Address
		System.out.println(allEmp[0].name);//Prints name
		
	}

}
