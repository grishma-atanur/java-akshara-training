package day44;
//Priority Queue -sort Students by id and name
import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString()

	{
		return id + "-" + name;
	}
	@Override //D N S R
	public int compareTo(Student s2)
	{
		Integer id1=this.id;
		Integer id2=s2.id;
		return id1.compareTo(id2);
	}
}

class PriorityByName implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		String name1=s1.name.toLowerCase();
		String name2=s2.name.toLowerCase();
		
		return name1.compareTo(name2);
		
	}
	
}

public class Demo4 {
	public static void main(String[] args) {

		PriorityQueue<Student> q = new PriorityQueue<Student>();
		q.offer(new Student(2,"Aadhya"));
		q.offer(new Student(1,"Viresh"));
		q.offer(new Student(3,"Grishma"));
		
		System.out.println(q.poll()); 
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println("-----");
		
		PriorityQueue<Student> q2 = new PriorityQueue<Student>(new PriorityByName());
		q2.offer(new Student(2,"Aadhya"));
		q2.offer(new Student(1,"Viresh"));
		q2.offer(new Student(3,"Grishma"));
		
		System.out.println(q2.poll()); 
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		

	}
}
