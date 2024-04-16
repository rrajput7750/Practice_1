package JavaPrograms;

public class EvenOddNum_InArray {

	public void OddNum() 
	{
		int a[]= {2,5,6,8,3,9,4};
		int len=a.length;
		System.out.println("Odd Number: ");
		for(int i=0;i<=len-1;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.print(" "+a[i]);
			}
		} }
	public static void main(String[] args) {
		EvenOddNum_InArray e = new EvenOddNum_InArray();
		int a[]= {2,5,6,8,3,9,4};
		int len=a.length;
		System.out.println("Even Number: ");
		for(int i=0;i<=len-1;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.print(" "+a[i]);
			}
		}
		System.out.println();
		e.OddNum();
	}
}
