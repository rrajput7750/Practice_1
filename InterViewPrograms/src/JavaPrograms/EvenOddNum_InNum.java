package JavaPrograms;
import java.util.Scanner;

public class EvenOddNum_InNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num :");
		int num=sc.nextInt();
		
		int EvenCount=0;
		int OddCount=0;
		
		while(num>0) 
		{
			int Rem=num%10;
			if(Rem%2==0) 
			{
				EvenCount++;
			}
			else 
			{
				OddCount++;
			}
			num=num/10;
		}
		System.out.println("The Even No is : "+EvenCount);
		System.out.println("The Odd No is : "+OddCount);
	}
}
