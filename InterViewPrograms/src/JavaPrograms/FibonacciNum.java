package JavaPrograms;

import java.util.Scanner;

public class FibonacciNum {

	public void Method_1(int num) 
	{
		int n1=0;
		int n2=1;
		int sum;
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++) 
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num :");
		int num=sc.nextInt();
		FibonacciNum fn = new FibonacciNum();
		fn.Method_1(num);
	}

}
