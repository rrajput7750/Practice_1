package JavaPrograms;
import java.util.Scanner;
public class Swap2Num {

	public void Swap2_Num(int a, int b) 
	{
		int t;
		System.out.println("Before Swaping Value A :"+a+" And B is :"+b);
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After Swaping Value A :"+a+" And B is :"+b);
		
	}
	public void Swap2_Num1(int a, int b) 
	{
		System.out.println("Before Swaping Value A :"+a+" And B is :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping Value A :"+a+" And B is :"+b);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value A and B :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Swap2Num sn= new Swap2Num();
		sn.Swap2_Num(a, b);
		sn.Swap2_Num1(a, b);
	}
}
