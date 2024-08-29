package day25;

class Student
{
	int id;
	String name;
}

class Emp
{
	int id;
	String name;
	
	Emp(int i, String s)
	{
		id=i;
		name=s;
	}
}

public class Demo1 {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=1;
		s1.name="Abhimanyu";
		
		Student s2=new Student();
		s2.id=2;
		s2.name="Arjuna";
		
		Student s3=new Student();
		s3.id=3;
		s3.name="Karana";
		
		System.out.println(s1.id + " " +s1.name);
		System.out.println(s2.id +" " +s2.name);
		System.out.println(s3.id + " "+s3.name);
		
		Emp e1=new Emp(1,"Abhimanyu");
		System.out.println(e1.id + " "+ e1.name);
		Emp e2= new Emp(2,"Arjuna");
		System.out.println(e2.id + " "+ e2.name);
		Emp e3=new Emp(3,"Karana");
		System.out.println(e3.id + " "+ e3.name);
		
		
	}

}
