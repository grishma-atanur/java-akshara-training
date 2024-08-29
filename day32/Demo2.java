package day32;
//Example of auto up-casting. explicit down-casting, direct downcasting(which is not allowed in java)

class Father {
	void radio() {
		System.out.println("Old radio");
	}

	void bike() {
		System.out.println("Old Bike");
	}
}

class Son extends Father {

	void bike() {
		System.out.println("New Bike");
	}

	void car() {
		System.out.println("New car...");
	}

}

public class Demo2 {
	public static void main(String[] args) {
//			Father f=new Father();
//			f.radio(); //old
//			f.bike(); //old

		Son s = new Son();
//			s.radio(); //old
//			s.bike(); //new  overridden
//			s.car(); 

		Father f2 = new Son(); //auto Up-casting(Methods present only in child class become hidden)
		f2.radio();
		f2.bike();
//		f2.car(); //can't be accessed from father as it hidden method(Method present in child class)

		Son s2 = (Son) f2; //explicit down-casting(f2 is upcasted so we can use it for explicit downcasting)
		s2.radio(); // old
		s2.bike(); // new
		s2.car(); // new
		
		Son s1=(Son) new Father();//Direct downcasting is not allowed in java
		s1.radio();
		s1.bike();
		s1.car(); //not allowed throws "ClasscastException" coz this is direct downcasting
	}

}
