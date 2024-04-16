package JavaPrograms;
import java.util.Scanner;
public class PalindromNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("REnter the Num :");
		int num =sc.nextInt();
		PalindromNum pn = new PalindromNum();
		pn.PalNum1(num);
	}
	public void PalNum1(int num) 
	{
		int Rev=0;
		int OrgNum=num;
		while(num!=0) 
		{
			Rev = Rev*10 + num%10;
			num =num/10;
		}
		if(OrgNum==Rev) 
		{
			System.out.println("The Num is Palindrom");	
		}
		else 
		{
			System.out.println("The Num is Not Palindrom");
		}}}