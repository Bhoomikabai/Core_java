package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class finallyblockDemo 
{
 public static void main(String[] args) throws IOException {
	FileInputStream fis=null;
	try {
		fis = new FileInputStream("c:\\desktop\\demo.pdf");
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	finally
	{
		fis.close();
	}
}	


}
