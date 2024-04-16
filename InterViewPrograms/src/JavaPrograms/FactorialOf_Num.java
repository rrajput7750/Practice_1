package JavaPrograms;
import java.util.Scanner;

public class FactorialOf_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num :");
		int num =sc.nextInt();
		FactorialOf_Num fn = new FactorialOf_Num();
		fn.Fact(num);
	}
	public void Fact(int num) 
	{
		int Fact=1;
		for(int i=1;i<=num;i++) 
		{
			Fact=Fact*i;
		}
		System.out.println("The Factorial of Num is :"+Fact);
		int Fact1=1;
		for(int i=num;i>=1;i--) 
		{
			Fact1=Fact1*i;
		}
		System.out.println("The Factorial of Num is :"+Fact1);
	}
}
