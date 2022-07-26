import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class AppendFile
{
   public static void main( String[] args )
   {	
      try{
    	String content = " No U";

    	File file =new File("Hello");

    	if(!file.exists()){
    	   file.createNewFile();
    	}

    	FileWriter fw = new FileWriter(file,true);

    	BufferedWriter bw = new BufferedWriter(fw);
    	bw.write(content);
    	bw.close();

	System.out.println("Data successfully appended at the end of file");

      }catch(IOException ioe){
         System.out.println("Exception occurred:");
    	 ioe.printStackTrace();
       }
   }
}