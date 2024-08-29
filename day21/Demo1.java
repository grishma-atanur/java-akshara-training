 package day21;
 
 class MyEmp{
	 
 }
public class Demo1 {
	
	public static void main(String[] args) {
		
		int i;//declarartion->int is a built in primitive data type , i is a variable name
		MyEmp e1;//Declarartion-->MyEmp is a user defined non-primitive data type;
		//e1 is a reference variable
		
		i=10;//initialization of i with the value 10
		System.out.println(i);
		
		e1=new MyEmp();//initialization of e1 with the value--->address of the MyEmp object
		System.out.println(e1);
		
	}

}
