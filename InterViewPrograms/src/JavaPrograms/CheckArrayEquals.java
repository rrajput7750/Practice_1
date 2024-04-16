package JavaPrograms;
import java.util.Arrays;

public class CheckArrayEquals {

	public void Way_1() 
	{
		int a1[]= {1,3,4,5};
		int a2[]= {1,2,3,4,5};
		
		boolean stetus=Arrays.equals(a1, a2);
		if(stetus==true) 
		{
			System.out.println("The Array is Equals :"+stetus);
		}
		else 
		{
			System.out.println("The Array is Not Equals: "+stetus);
		}
	}
	public void Way_2() 
	{
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		boolean stetus =true;
		
		if(a1.length==a2.length) 
		{
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=a2[i]) 
				{
					stetus=false;
				}
			}
		}
		if(stetus==true) 
		{
			System.out.println("Array are Equal");
		}
		else 
		{
			System.out.println("Array are Not Equal");
		}	
	}
	public static void main(String[] args) {
		CheckArrayEquals ce= new CheckArrayEquals();
		//ce.Way_1();
		ce.Way_2();
	}
}
