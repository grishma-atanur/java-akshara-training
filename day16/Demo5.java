package day16;

public class Demo5 {
	//Once Array is created we cannot resize it
	public static void main(String[] args) {
		 
		String [] students=new String[3];
		students[0]="Asha";
		students[0]="Bindu";
		students[0]="Chandra";
		
		for(String name:students)
		{
			System.out.println(name);
		}
		
		students=new String[4];
		students[3]="Divya";
		
		for(String name:students)
		{
			System.out.println(name);
		}
	}

}
