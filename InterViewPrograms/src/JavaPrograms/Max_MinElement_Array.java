package JavaPrograms;

import java.util.Scanner;

public class Max_MinElement_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Total Num of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the Num of Array Element :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Max_MinElement_Array ar = new Max_MinElement_Array();
		ar.Approch_1(arr);
	}
	public void Approch_1(int arr[]) 
	{
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) 
		{
			if(arr[i]<min) 
			{
				min=arr[i];
			}else if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		System.out.println("The Smollest Number Is : "+min);
		System.out.println("The Greatest Number Is : "+max);
	}
}
