package JavaPrograms;
import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array : ");
		int n=sc.nextInt();
		System.out.println("Enter the Element of Array :");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Search Element :");
		int se=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(se==arr[i]) 
			{
				System.out.println("Element "+arr[i]+" Found In Array :");
				flag=true;
				break;
			}
		}
		if(flag==false) 
		{
			System.out.println("The Element Not Found");
		}
	}
}
