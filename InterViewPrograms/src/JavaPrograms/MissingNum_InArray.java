package JavaPrograms;
import java.util.Scanner;

public class MissingNum_InArray {

	public void MissArrayNum() 
	{
		System.out.println("******************************************");
		int a[]= {1,2,3,4,5,6,8,9,10};
		int Sum1=0;
		for(int i=0;i<a.length;i++) 
		{
			Sum1=Sum1+a[i];
		}
		System.out.println("Sum of Element in Array: "+Sum1);
		int Sum2=0;
		for(int i=1;i<=10;i++) 
		{
			Sum2=Sum2+i;
		}
		System.out.println("Sum of the Range of Array Element :"+Sum2);
		int Miss=Sum2-Sum1;
		System.out.println("The Missing Num is :"+Miss);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Total Num of Array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Num of Element :");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		
		int sum=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++) 
		{
			sum=sum-arr[i];
		}
		System.out.println("Missing Element is :"+sum);
		
		MissingNum_InArray a= new MissingNum_InArray();
		a.MissArrayNum();
	}
}
