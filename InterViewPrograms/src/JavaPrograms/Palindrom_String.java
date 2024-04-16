package JavaPrograms;
import java.util.Scanner;
public class Palindrom_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		Palindrom_String ps= new Palindrom_String();
		ps.PalString_1(str);
	}
	public void PalString_1(String str) 
	{
		String Rev="";
		String OrgStr=str;
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			Rev=Rev+str.charAt(i);
		}
		System.out.println("The Reverce String is : "+Rev);
	
		if(OrgStr.equals(Rev)) 
		{
			System.out.println("The String is Palindrom");
		}
		else 
		{
			System.out.println("The String Is Not Palindrom");
		}
	}
}