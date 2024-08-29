package day41;
//StringBuffer-In StringBuffer  we can change the object once created->StringBuffer is Mutable
public class Demo2 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Mom");
		s1.reverse();
		System.out.println(s1);
		
		s1.append("Dad");
		System.out.println(s1);
		
		s1.insert(3,"-");
		System.out.println(s1);
		
		s1.delete(3,4);
		System.out.println(s1);
	}

}
