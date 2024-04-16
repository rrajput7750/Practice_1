package JavaPrograms;
import java.util.Scanner;

public class Reverce_String {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		Reverce_String rs= new Reverce_String();
		rs.Reverce_String1(str);
		rs.Reverce_String2(str);
		rs.Reverce_String3(str);
	}
	public void Reverce_String1(String str) 
	{
		String RevStr="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) 
		{
			RevStr=RevStr+str.charAt(i);
		}
		System.out.println("The Reverce String is :"+RevStr);
	}
	
	public void Reverce_String2(String str) 
	{
		String Rev="";
		char a[] =str.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) 
		{
			Rev = Rev+a[i];
		}
		System.out.println("The Reverce String Is :="+Rev);
	}
	public void Reverce_String3(String str) 
	{
		StringBuffer sb= new StringBuffer(str);
		System.out.println("The Reverce String is: "+sb.reverse());
	}
}