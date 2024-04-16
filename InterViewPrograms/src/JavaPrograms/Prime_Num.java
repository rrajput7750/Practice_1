package JavaPrograms;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num=sc.nextInt();
		Prime_Num pn = new Prime_Num();
		pn.PrimeCheck(num);
	}
	public void PrimeCheck(int num) 
	{
		int count = 0;
		if(num>1) 
		{
			for(int i=1;i<=num;i++) 
			{
				if(num%i==0) 
				  count++;	
			}
			if(count==2) 
			{
				System.out.println("It is A prime Number");
			}else 
			{
				System.out.println("It is Not Prime Number");
			}
		}else 
		{
			System.out.println("It is Not Prime Number");
		}
	}

}
