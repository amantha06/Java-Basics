import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
   public static void main(String[] args) {
      FileOutputStream fos = null;
      File file;
      String mycontent = "Hi to you too";
      try {

	  file = new File("Hello");
	  fos = new FileOutputStream(file);

          
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  
	  byte[] bytesArray = mycontent.getBytes();

	  fos.write(bytesArray);
	  fos.flush();
	  System.out.println("File Written Successfully");
       } 
       catch (IOException ioe) {
	  ioe.printStackTrace();
       } 
       finally {
	  try {
	     if (fos != null) 
	     {
		 fos.close();
	     }
          } 
	  catch (IOException ioe) {
	     System.out.println("Error in closing the Stream");
	  }
       }
   }
}