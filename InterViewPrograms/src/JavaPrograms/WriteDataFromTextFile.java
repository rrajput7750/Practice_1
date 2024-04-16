package JavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFromTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("My Name Is Rahul And I am An Software Tester My Annual Package Is 18 LPA");
		bw.write("My Name Is Shyam And I am An Software Tester My Annual Package Is 22 LPA");
		bw.write("My Name Is Nilesh And I am An Software Tester My Annual Package Is 20 LPA");
		
		System.out.println("Finished.........!!");
		bw.close();
	}
}
