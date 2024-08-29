package day31;

class Student
{
	int rollno;
	String name;
	
	Student(int id, String name)
	{
		this.rollno=id;
		this.name=name;
	}
	@Override
	public String toString() 
	{
		return rollno + "-" + name;
	}
}
public class Demo5 {
	public static void main(String[] args)
	{
		Student s1=new Student(1,"Grishma");
		Student s2=new Student(2,"Sneha");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
