package JavaPrograms;
import java.util.*;

public class BubbleSortingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Length :");
		int n=sc.nextInt();
		System.out.println("Enter the Number of Array :");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Way_1(arr);
	}
	public static void Way_1(int arr[]) 
	{
		int l=arr.length;
		for(int i=0;i<l-1;i++) 
		{
			for(int j=0;j<l-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is :"+Arrays.toString(arr));
   }
}
