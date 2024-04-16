package JavaPrograms;
import java.util.Scanner;

public class ReverceNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=sc.nextInt();
		ReverceNum rn= new ReverceNum();
		rn.Reverce_1(num);
		rn.Reverce_2(num);
		rn.Reverce_3(num);
	}
	public void Reverce_1(int num) 
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The Reverce Num is :"+rev);
	}
	
	public void Reverce_2(int num) 
	{
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("The Reverce Number is :"+rev);
	}
	
	public void Reverce_3(int num) 
	{
		StringBuffer sb= new StringBuffer();
		sb.append(num);
		StringBuffer rev=sb.reverse();
		System.out.println("The Reverce Number is :"+rev);
	}

}
