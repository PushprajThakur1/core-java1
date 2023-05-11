package Exercise;

public class LargestNumberOfArray {
	
	public static void main(String[] args) {
		int []a = {4,3,5,2,1,6,};
		int max = a[0];
		for (int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	   
		


}
}