package day33;
//example of passing arguments to main method

public class Demo5 {
	static strictfp final public  void main(String[] args) {//we can change main method like this  
		 
		int count=args.length;
		System.out.println(count);
		
		for(String a:args)
		{
			System.out.println(a);
		}
		
	}

}
