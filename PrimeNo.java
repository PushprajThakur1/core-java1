package Exercise;

public class PrimeNo {
	public static void main(String[] args) {
		int number = 11;
		int count = 0;
		for (int i = 2; i <number ; i++) {
			if (number % i == 0) {
				System.out.println(i);
				count ++;
				
			}
		}
		if (count == 0) {
			System.out.println("Prime no ");
			
		}else {
			System.out.println("Not prime no ");
		}
	}

}
