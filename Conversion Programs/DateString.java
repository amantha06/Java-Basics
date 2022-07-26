import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
 public class DateString {  
       public static void main(String args[]){  
                Date myDate = Calendar.getInstance().getTime();  
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
                String strDate = dateFormat.format(myDate);  
                System.out.println("Converted String: " + strDate);  
                 
        }  
}  
