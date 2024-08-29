package day43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> //comaprable can be used for just one sorting mechanism
//by default it is ascending
//for more sorting , we need to use comparator 
{
	private int id;
	private String name;
	
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+ "_" + name;
	}
	
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}

	@Override
	public int compareTo(Student s2) {//whenever compareTo(2nd obj) it is always 2nd object
		Integer id1=this.id; //current object is the first student(passed automatically)
		Integer id2=s2.id;
		return id1.compareTo(id2);
	}
	
}
class SortStudentByIDD implements Comparator<Student> //for descending order
{

	@Override
	public int compare(Student s1, Student s2) {
		Integer id1=s1.getID();
		Integer id2=s2.getID();
		return -id1.compareTo(id2);
		}
	}

class SortStudentByNameAtoZ implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		String name1=s1.getName();
		String name2=s2.getName();
		return name1.compareTo(name2);
	}
	
}
class SortStudentByNameZtoA implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		String name1=s1.getName();
		String name2=s1.getName();
		return -name1.compareTo(name2);
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
		List<Student> allStudent = new ArrayList <Student> (); 
		allStudent.add(new Student(2, "Prem"));
		allStudent.add(new Student(1, "Sunita"));
		allStudent.add(new Student(3, "Priya"));
		System.out.println(allStudent); //before sorting
		
		Collections.sort(allStudent); //sort using comparable-Ascending(Default)
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByIDD()); //sort using comparator-Descending
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByNameAtoZ()); //sort using comparator-ByName
		System.out.println(allStudent);
		
		Collections.sort(allStudent, new SortStudentByNameZtoA()); //sort using comparator-ByName-Reverse
		System.out.println(allStudent);

		
	}

}
