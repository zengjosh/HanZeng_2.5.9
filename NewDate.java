import java.util.Calendar;
public class NewDate {
  
  public static String GetCurrentTime(){
    Calendar cal = Calendar.getInstance();
    String dateTimeStr = cal.getTime().toString();
    
    return dateTimeStr;
  }
}