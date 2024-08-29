package day16;

public class Demo2 {

	public static void main(String[] args) {
		//Enhanced for loop - for each loop
		//its faster. there is no head ache of start and end condition also 
		//there is no update section
		
		int[] a= {10,20,30};
		 for(int v:a)
		 {
			 System.out.println(v);
		 }
		 String[] allcity= {"Agra", "Banglore", "Chennai"};
		 
		 for(String city:allcity)
		 {
			 System.out.println(city);
		 }
		 
		 for(String city:allcity)
		 {
			 System.out.println("Hi");
		 }
	}
}
