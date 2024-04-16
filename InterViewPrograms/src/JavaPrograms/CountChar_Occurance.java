package JavaPrograms;
import java.util.Scanner;

public class CountChar_Occurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		System.out.println("Enter Count Char In String: ");
		char a=sc.next().charAt(0);
		System.out.println("The Enter String Is :"+s);
		int total=s.length();
		int After_Total = s.replace(""+a+"", "").length();
		
		int count=total-After_Total;
		
		System.out.println("The Num of Char is :"+count);
		Way1(s); 
	}
	public static void Way1(String s) 
	{
		int count= 0;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)== 'a') 
			{
				count++;
			}
		}
		System.out.println("The Char Occurunce in String is :"+count);
	}
}
