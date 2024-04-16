package JavaPrograms;

import java.util.*;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		
		System.out.println("The Enter String Is :"+s);
		
		String Chang=s.replaceAll("\\s", "");
		
		System.out.println("After Removing The White Space the String is :"+Chang);
	}
}
