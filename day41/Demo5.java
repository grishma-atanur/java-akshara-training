package day41;
//Generic class- We go for generic class when we want to provide
//functionality irrespective of the data type

class G<T>{
	private T v;
	G(T v)
	{
		this.v=v;
	}

	public T get() {
		return v;
	}
	
	public void set(T v)
	{
		this.v=v;
	}
}

public class Demo5 {
public static void main(String[] args) {
	G g1=new G(100); //data type is not defined so return type by default is Object
	g1.set(150);
	Object v = g1.get();
	System.out.println(v);
	
	G<String> g2=new G<String> ("Grishma");
	g2.set("Aadhya");
	String v2 = g2.get();
	System.out.println(v2);

	G<Integer> g3=new G<Integer> (100);
	g3.set(999);
	Integer v3 = g3.get();
	System.out.println(v3);
	
	G<Cat> g4=new G<Cat> (new Cat());
	g4.set(new Cat());
	Cat v4 = g4.get();
	System.out.println(v4);
	
}
}
 