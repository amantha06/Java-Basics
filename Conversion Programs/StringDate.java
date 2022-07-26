import java.text.SimpleDateFormat;  
import java.util.Date;  
public class StringDate {  
public static void main(String[] args)throws Exception {  
    String Date1="07/03/2006";  
    Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(Date1);  
    System.out.println(Date1+"\t"+date2);  
}  
}  