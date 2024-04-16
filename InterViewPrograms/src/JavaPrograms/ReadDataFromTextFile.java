package JavaPrograms;

import java.io.*;
import java.util.*;

public class ReadDataFromTextFile {
	public void Way_1() throws IOException 
	{
		FileReader fr= new FileReader("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		BufferedReader br= new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null) 
		{
			System.out.println(str);
		}
		br.close();
	}
	public void Way_2() throws IOException 
	{
		File f= new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		}
	}
	public static void main(String[] args) throws IOException {
		ReadDataFromTextFile rf= new ReadDataFromTextFile();
		//rf.Way_1();
		//rf.Way_2();
		File f= new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		Scanner sc = new Scanner(f);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());	
	}
}
