package day16;

public class Demo8 {
	// count number of rows and number of column and print content of Array
	public static void main(String[] args) {
		String[][] s = new String[3][2];

		s[0][0] = "A1";
		s[0][1] = "Aakash";

		s[1][0] = "B1";
		s[1][1] = "Bharat";

		s[2][0] = "C1";
		s[2][1] = "Chandra";

		System.out.println(s.length);// row count

		System.out.println(s[0].length);// column count of 1st row
		System.out.println(s[1].length);// column count of 2nd row
		System.out.println(s[2].length);// column count of 3rd row

		for (int i = 0; i < 3; i++) {// Rows
			for (int j = 0; j < 2; j++)// Colums
			{
				System.out.println(s[i][j]);
			}
		}
		System.out.println("------");

		// Instead of hardcoding the array size like above in for loop
		// we can make it dynamic
	
		for (int i = 0; i < s.length; i++) // Rows
			for (int j = 0; j < s[i].length; j++)// Colums
			{
				System.out.print(s[i][j]+ " ");
			}
		
		System.out.println();
		
	}
}
