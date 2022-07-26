import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CurrentDay{
   public static void main(String[] args){
   
   Date myDate = new Date();
   System.out.println("Today is "+  myDate);
   
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
   LocalDate locdat = LocalDate.now();   
      
   String locdatStr = locdat.format(formatter);
   System.out.println("Local date is " + locdatStr);
  
   }
}