      package day25;
      
    class C
    {
    	int i=10;
    	int j=20;
    
    C()
    {
    	int i=100;
    	System.out.println(i);//100->accesses local variable
    	System.out.println(j);//20->since this is not present in this black it widens 
    	//the searching and finds j as Global variable
    	
    	System.out.println(this.i);//10 ->accesses Global variable
    	System.out.println(this.j);//20->accesses Global variable
    }
    }

public class Demo5 {
	
	public static void main(String[] args) {
		C c1=new C();
	}

}
