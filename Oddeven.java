package Exercise;

public class Oddeven {
	public static void main(String[] args) {
    
		//sum of Consecutive N odd number 
		
		int odd = 15;
		int sum = 0;
		for (int i = 1; i <= odd; i = i + 2) {
			System.out.println(i);
			sum = sum + i;

		}
		System.out.println("sum of odd =" + sum);
		
		//sum of Consecutive N Even number

		int even = 20;
		int sum1 = 0;
		for (int a = 2; a <= even; a = a + 2) {
			System.out.println(a);
			sum1 = sum1 + a;

		}
		System.out.println("Sum of Even =" + sum);
	}

}
