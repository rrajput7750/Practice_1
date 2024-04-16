package JavaPrograms;

import java.util.Scanner;

public class ReverceEach_WordInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		
		String word []=s.split(" ");
		
		String ReverceStr="";
		for(String a : word) 
		{
			for(int i=a.length()-1;i>=0;i--) 
			{
				ReverceStr=ReverceStr+a.charAt(i);
			}
		}
		System.out.println("The Reverce Word is :"+ReverceStr);
		System.out.println("********************************************");
		
		// Different Way
		
		String s1 ="Rahul Rajput is My Name"; 
		String word1 []=s1.split("\\s");
		String ReverceStr1="";
		for(String w:word1) 
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			ReverceStr1=ReverceStr1+sb.toString()+" ";
		}
		System.out.println("The Reverce String is :"+ReverceStr1);
	}
}
