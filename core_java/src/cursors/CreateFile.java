package cursors;
import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		    try {
		      File Obj = new File("filename.txt");
		      if (Obj.createNewFile()) {
		        System.out.println("File created: " + Obj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	}


/*
 * To create a file in Java, you can use the createNewFile() method. 
 * This method returns a boolean value: true if the file was successfully created, and false if the file already exists. 
 * Note that the method is enclosed in a try...catch block.
 * This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):
 */
