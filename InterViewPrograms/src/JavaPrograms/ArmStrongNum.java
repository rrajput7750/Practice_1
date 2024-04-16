package JavaPrograms;
import java.util.Scanner;

public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chose 1,2,3,4,5,6 Digit u will Enter Number: ");
		int x=sc.nextInt();
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int orgnum=n;
		int Digit,a=0;
		while(n!=0) 
		{
			Digit=n%10;
			a+=Math.pow(Digit, x);
			n/=10;
		}
		if(a==orgnum) 
		{
			System.out.println(orgnum+" is an Armstrong number");
		}else 
		{
			System.out.println(orgnum+" is not an Armstrong number");
		}
	}
}
