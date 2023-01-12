package cursors;
import java.io.File;  // Import the File class

public class getfile {
	public static void main(String[] args) {
		File Obj = new File("filename.txt");
	    if (Obj.exists()) {
	      System.out.println("File name: " + Obj.getName());//This function returns the Name of the given file object
	      System.out.println("Absolute path: " + Obj.getAbsolutePath());//This function returns the absolute pathname of the given file object.
	      System.out.println("Writeable: " + Obj.canWrite());// Tests whether the application can modify the file denoted by this abstract pathname.
	      System.out.println("Readable " + Obj.canRead());//determines whether the program can read the file denoted by the abstract pathname. 
	      System.out.println("File size in bytes " + Obj.length());//returns the length of the file denoted by the this abstract pathname was length.
	    } else {
	      System.out.println("The file does not exist.");
	    }
	  }
	}

