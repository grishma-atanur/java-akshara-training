package day44;
//Treeset
import java.util.TreeSet;

class Cat implements Comparable<Cat>
{
	String name;
	Cat(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	@Override
	public int compareTo(Cat cat2) {
		String name1=this.name;
		String name2=cat2.name;
		return name1.compareTo(name2);
	}
}

public class Demo9 {
	public static void main(String[] args) {
		TreeSet<Cat> cats=new TreeSet<Cat>();
		cats.add(new Cat("pinky"));
		cats.add(new Cat("chinki"));
		cats.add(new Cat("dinki"));
		
		System.out.println(cats);
		
		
	}

}
