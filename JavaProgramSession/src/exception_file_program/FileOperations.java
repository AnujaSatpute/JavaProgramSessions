package exception_file_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperations {

	FileInputStream fis = null;

//	void connectData() throws FileNotFoundException {
//		fis = new FileInputStream("D:\\java_Workspace\\text\\first.txt");//read ascii value of characters.
//	}

	void readData() //throws IOException
	{
		try {
		fis = new FileInputStream("D:\\java_Workspace\\text\\abc.txt");
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	void add(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}

	public static void main(String[] args) //throws IOException
	{
		// TODO Auto-generated method stub
		FileOperations obj = new FileOperations();
	//	obj.connectData();
		/*try 
		{*/
		obj.readData();
	//	}
		/*catch(IOException e)
		{
			e.printStackTrace();
		}*/
		obj.add(100, 300);
		System.out.println("Done.");
	}
	

}
