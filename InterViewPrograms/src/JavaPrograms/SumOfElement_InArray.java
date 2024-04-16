package JavaPrograms;

public class SumOfElement_InArray {

	public static void main(String[] args) {
		int a[]= {5,8,4,3,5,2,1};
		int len=a.length;
		int sum =0;
		for(int i=0;i<=len-1;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("The Sum of Array is : "+sum);
		int Sum=0;
		// Enhanced For Loop
		for(int Value:a) 
		{
			Sum=Sum+Value;
		}
		System.out.println("The Sum of Array is : "+Sum);
	}
}
