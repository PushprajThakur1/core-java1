package Exercise;

public class SecondLargestNo {
	public static void main(String[] args) {
		int[] a = { 10, 11, 105, 100, 999 };
		int y = 0;
		int x = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				y = x;
				x = a[i];

			} else if (a[i] > y && a[i] < x) {
				y = a[i];
			}
		}
		System.out.println("Second Largest Number ="+y);
		System.out.println("Highest number =" +x);

	}

}
