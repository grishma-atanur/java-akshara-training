package day14;

public class Demo8 {
	public static void main(String[] args) {
		int n = 1;
		int count = 1;

		while (count <=100) {

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
				count++;
				System.out.println(count + ")" + n);
			}
			n++;
		}

	}
}
