package JavaPrograms;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num= Sc.nextInt();
		
		int Sum=0;
		while(num>0) 
		{
			Sum=Sum+num%10;
			num=num/10;
		}
		System.out.println("The Sum of The Digit is :"+Sum);
	}

}
