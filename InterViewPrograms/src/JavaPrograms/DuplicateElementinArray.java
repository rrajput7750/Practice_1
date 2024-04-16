package JavaPrograms;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementinArray {

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
		Way1(arr);
		Way2();
	}
	public static void Way1(int arr[]) 
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					System.out.println("The Duplicate Element found :"+arr[i]);
					flag=true;
				} 
			} }
		if(flag==false) 
		{
			System.out.println("There is no duplicate Element Found");
		}
	}
	public static void Way2() 
	{
		boolean flag=false;
		String arr[]= {"Java","C++","Pythn","Java","C++"};
		HashSet<String> hs = new HashSet<String>();
		for(String s:arr) 
		{
			if(hs.add(s)==false) 
			{
				System.out.println("Found Duplicate Element :"+s);
				flag=true;
			}
		}
		if(flag==false) 
		{
			System.out.println("There is no duplicate Element Found");
		}
	}
}
