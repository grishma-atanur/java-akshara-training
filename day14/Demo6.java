package day14;

public class Demo6 {
	public static void main(String[] args) {
		int n = 1;
		
		for (n = 1; n <= 100; n++) {
			
			boolean prime = true;
			if (n == 1) {
				prime = false;

			} else {
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						prime = false;
						break;
					}
				}

			}
			if (prime) {
				System.out.println(n);
			}
		}

	}

}
