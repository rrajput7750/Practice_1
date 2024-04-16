package JavaPrograms;
import java.util.*;

public class SortingArray_BuildInFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Length :");
		int n=sc.nextInt();
		System.out.println("Enter the Number of Array :");
		Integer arr[] = new Integer[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Before Sorting :"+Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		System.out.println("Array After Sorting 1 :"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Array After Sorting 2 :"+Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array After Sorting 3 In Decending :"+Arrays.toString(arr));
	}

}
