package cursors;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class readfile {
	public static void main(String[] args) {
		try {
		      File Obj = new File("filename.txt");
		      Scanner Reader = new Scanner(Obj);
		      while (Reader.hasNextLine()) {
		        String data = Reader.nextLine();
		        System.out.println(data);
		      }
		      Reader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	}


