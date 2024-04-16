package JavaPrograms;
import java.util.Scanner;
public class LargestOf3Num {
	
	public void LargNum(int num1, int num2, int num3) 
	{
		if(num1>num2 && num1>num3) 
		{
			System.out.println(num1+": Num1 is Greater Number");
		}
		else if(num2>num1 && num2>num3) 
		{
			System.out.println(num2+": Num2 is Greater Number");
		}
		else 
		{
			System.out.println(num3+": Num3 is Greater Number\"");
		}
	}
	public void TernaryOperator(int num1, int num2, int num3) 
	{
		int a=num1;
		int b=num2;
		int c=num3;
		int larg1=a>b?a:b;
		int larg2=c>larg1?c:larg1;
		System.out.println(larg2+ ":is Largest value");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Num :");
		int num1=sc.nextInt();
		System.out.println("Enter the 2st Num :");
		int num2=sc.nextInt();
		System.out.println("Enter the 3st Num :");
		int num3=sc.nextInt();
		LargestOf3Num ln= new LargestOf3Num();
		ln.TernaryOperator(num1, num2, num3);
		ln.LargNum(num1, num2, num3);
		}
	}
