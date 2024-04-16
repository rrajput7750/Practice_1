package JavaPrograms;

import java.util.Scanner;

public class CountWord_InString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		
		int count=1;
		for(int i=0;i<s.length();i++) 
		{
		if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) 
		{
			count++;
		}
		}
		System.out.println("The Word in String is :"+count);
	}
}
