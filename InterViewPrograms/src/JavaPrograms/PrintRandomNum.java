package JavaPrograms;

import java.util.Random;

public class PrintRandomNum {

	public static void main(String[] args) {
		Random rand= new Random();
		int Rand=rand.nextInt(100);
		System.out.println(" "+Rand);
		
		System.out.println(Math.random());
	}

}
