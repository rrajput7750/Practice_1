package JavaPrograms;
import java.util.*;
public class RemoveJunk_InString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		
		System.out.println("Entered String is :"+s);
		
		String Org=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("The Change String Is :"+Org);
	}
}
